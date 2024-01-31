package com.example.btpsd.converters;

import com.example.btpsd.commands.ModelSpecificationsDetailsCommand;
import com.example.btpsd.model.*;
import io.micrometer.common.lang.Nullable;
import lombok.RequiredArgsConstructor;
import lombok.Synchronized;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@RequiredArgsConstructor
@Component
public class ModelSpecDetailsCommandToModelSpecDetails implements Converter<ModelSpecificationsDetailsCommand, ModelSpecificationsDetails> {

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
        if (source.getCurrencyCode() != null) {
            Currency currency = new Currency();
            currency.setCurrencyCode(source.getCurrencyCode());
            modelSpecificationsDetails.setCurrency(currency);
            currency.addModelSpecDetails(modelSpecificationsDetails);
        }
        if (source.getFormulaCode() != null) {
            Formula formula = new Formula();
            formula.setFormulaCode(source.getFormulaCode());
            modelSpecificationsDetails.setFormula(formula);
            formula.addModelSpecDetails(modelSpecificationsDetails);
        }
        if (source.getPersonnelNumberCode() != null) {
            PersonnelNumber personnelNumber = new PersonnelNumber();
            personnelNumber.setPersonnelNumberCode(source.getPersonnelNumberCode());
            modelSpecificationsDetails.setPersonnelNumber(personnelNumber);
            personnelNumber.addModelSpecDetails(modelSpecificationsDetails);
        }
        if (source.getServiceTypeCode() != null) {
            ServiceType serviceType = new ServiceType();
            serviceType.setServiceTypeCode(source.getServiceTypeCode());
            modelSpecificationsDetails.setServiceType(serviceType);
            serviceType.addModelSpecDetails(modelSpecificationsDetails);
        }
        if (source.getMaterialGroupCode() != null) {
            MaterialGroup materialGroup = new MaterialGroup();
            materialGroup.setMaterialGroupCode(source.getMaterialGroupCode());
            modelSpecificationsDetails.setMaterialGroup(materialGroup);
            materialGroup.addModelSpecDetails(modelSpecificationsDetails);
        }
        if (source.getUnitOfMeasurementCode() != null) {
            UnitOfMeasurement unitOfMeasurement = new UnitOfMeasurement();
            unitOfMeasurement.setUnitOfMeasurementCode(source.getUnitOfMeasurementCode());
            modelSpecificationsDetails.setUnitOfMeasurement(unitOfMeasurement);
            unitOfMeasurement.addModelSpecDetails(modelSpecificationsDetails);
        }
        if (source.getServiceNumberCode() != null) {
            ServiceNumber serviceNumber = new ServiceNumber();
            serviceNumber.setServiceNumberCode(source.getServiceNumberCode());
            modelSpecificationsDetails.setServiceNumber(serviceNumber);
            serviceNumber.addModelSpecDetails(modelSpecificationsDetails);
        }

        modelSpecificationsDetails.setSelectionCheckBox(source.getSelectionCheckBox());
        modelSpecificationsDetails.setLineIndex(source.getLineIndex());
        modelSpecificationsDetails.setDeletionIndicator(source.getDeletionIndicator());
        modelSpecificationsDetails.setShortText(source.getShortText());
        modelSpecificationsDetails.setQuantity(source.getQuantity());
        modelSpecificationsDetails.setGrossPrice(source.getGrossPrice());
        modelSpecificationsDetails.setOverFulfilmentPercentage(source.getOverFulfilmentPercentage());
        modelSpecificationsDetails.setPriceChangedAllowed(source.getPriceChangedAllowed());
        modelSpecificationsDetails.setUnlimitedOverFulfillment(source.getUnlimitedOverFulfillment());
        modelSpecificationsDetails.setPricePerUnitOfMeasurement(source.getPricePerUnitOfMeasurement());
        modelSpecificationsDetails.setExternalServiceNumber(source.getExternalServiceNumber());
        modelSpecificationsDetails.setNetValue(source.getNetValue());
        modelSpecificationsDetails.setServiceText(source.getServiceText());
        modelSpecificationsDetails.setLineText(source.getLineText());
//        modelSpecificationsDetails.setFormula(source.getFormula());
        modelSpecificationsDetails.setLineNumber(source.getLineNumber());
        modelSpecificationsDetails.setAlternatives(source.getAlternatives());
        modelSpecificationsDetails.setBiddersLine(source.getBiddersLine());
        modelSpecificationsDetails.setSupplementaryLine(source.getSupplementaryLine());
        modelSpecificationsDetails.setLotSizeForCostingIsOne(source
                .getLotSizeForCostingIsOne());

        if (source.getModelSpecificationsCommands() != null && source.getModelSpecificationsCommands().size() > 0) {
        source.getModelSpecificationsCommands()
                .forEach(modelSpecificationsCommand -> modelSpecificationsDetails.getModelSpecifications().add(modelSpecConverter.convert(modelSpecificationsCommand)));
    }

        return modelSpecificationsDetails;

    }
}