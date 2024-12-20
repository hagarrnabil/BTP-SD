package com.example.btpsd.converters;

import com.example.btpsd.commands.ModelSpecificationsDetailsCommand;
import com.example.btpsd.model.*;
import io.micrometer.common.lang.Nullable;
import lombok.RequiredArgsConstructor;
import lombok.Synchronized;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.math3.random.RandomDataGenerator;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@RequiredArgsConstructor
@Slf4j
@Component
public class
ModelSpecDetailsCommandToModelSpecDetails implements Converter<ModelSpecificationsDetailsCommand, ModelSpecificationsDetails> {

    private final ModelSpecificationsCommandToModelSpecifications modelSpecConverter;

    @Synchronized
    @Nullable
    @Override
    public ModelSpecificationsDetails convert(ModelSpecificationsDetailsCommand source) {

        if (source == null) {
            return null;
        }

        final ModelSpecificationsDetails modelSpecificationsDetails = new ModelSpecificationsDetails();
        modelSpecificationsDetails.setModelSpecDetailsCode(source.getModelSpecDetailsCode());
        modelSpecificationsDetails.setPersonnelNumberCode(source.getPersonnelNumberCode());
        modelSpecificationsDetails.setFormulaCode(source.getFormulaCode());
        modelSpecificationsDetails.setMaterialGroupCode(source.getMaterialGroupCode());
        modelSpecificationsDetails.setLineTypeCode(source.getLineTypeCode());
        modelSpecificationsDetails.setCurrencyCode(source.getCurrencyCode());
        if (source.getServiceNumberCode() != null) {
            ServiceNumber serviceNumber = new ServiceNumber();
            serviceNumber.setServiceNumberCode(source.getServiceNumberCode());
            modelSpecificationsDetails.setServiceNumber(serviceNumber);
            serviceNumber.addModelSpecDetails(modelSpecificationsDetails);
        }
        else {
            RandomDataGenerator randomDataGenerator = new RandomDataGenerator();
            Long min = 1L;
            Long max = 100L;
            Long randomWithRandomDataGenerator = randomDataGenerator.nextLong(min, max);
            modelSpecificationsDetails.setNoServiceNumber(randomWithRandomDataGenerator);
        }
        modelSpecificationsDetails.setSelectionCheckBox(source.getSelectionCheckBox());
        modelSpecificationsDetails.setLineIndex(source.getLineIndex());
//        modelSpecificationsDetails.setDeletionIndicator(source.getDeletionIndicator());
        modelSpecificationsDetails.setShortText(source.getShortText());
        modelSpecificationsDetails.setGrossPrice(source.getGrossPrice());
        modelSpecificationsDetails.setOverFulfilmentPercentage(source.getOverFulfilmentPercentage());
        modelSpecificationsDetails.setPriceChangedAllowed(source.getPriceChangedAllowed());
        modelSpecificationsDetails.setUnlimitedOverFulfillment(source.getUnlimitedOverFulfillment());
        modelSpecificationsDetails.setPricePerUnitOfMeasurement(source.getPricePerUnitOfMeasurement());
        modelSpecificationsDetails.setExternalServiceNumber(source.getExternalServiceNumber());
        modelSpecificationsDetails.setUnitOfMeasurementCode(source.getUnitOfMeasurementCode());
        modelSpecificationsDetails.setServiceTypeCode(source.getServiceTypeCode());
        modelSpecificationsDetails.setQuantity(source.getQuantity());
        modelSpecificationsDetails.setNetValue(source.getGrossPrice() * modelSpecificationsDetails.getQuantity());
        modelSpecificationsDetails.setServiceText(source.getServiceText());
        modelSpecificationsDetails.setLineText(source.getLineText());
        modelSpecificationsDetails.setLineNumber(source.getLineNumber());
        modelSpecificationsDetails.setAlternatives(source.getAlternatives());
        modelSpecificationsDetails.setBiddersLine(source.getBiddersLine());
        modelSpecificationsDetails.setSupplementaryLine(source.getSupplementaryLine());
        modelSpecificationsDetails.setLotSizeForCostingIsOne(source.getLotSizeForCostingIsOne());
        modelSpecificationsDetails.setLastChangeDate(source.getLastChangeDate().now());
        if (source.getModelSpecificationsCommands() != null && source.getModelSpecificationsCommands().size() > 0) {
        source.getModelSpecificationsCommands()
                .forEach(modelSpecificationsCommand -> modelSpecificationsDetails.getModelSpecifications().add(modelSpecConverter.convert(modelSpecificationsCommand)));
        }

        return modelSpecificationsDetails;

    }
}
