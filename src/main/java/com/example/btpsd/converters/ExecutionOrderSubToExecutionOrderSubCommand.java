package com.example.btpsd.converters;

import com.example.btpsd.commands.ExecutionOrderSubCommand;
import com.example.btpsd.model.ExecutionOrderSub;
import io.micrometer.common.lang.Nullable;
import lombok.RequiredArgsConstructor;
import lombok.Synchronized;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@RequiredArgsConstructor
@Component
public class ExecutionOrderSubToExecutionOrderSubCommand implements Converter<ExecutionOrderSub, ExecutionOrderSubCommand> {

    @Synchronized
    @Nullable
    @Override
    public ExecutionOrderSubCommand convert(ExecutionOrderSub source) {

        if (source == null) {
            return null;
        }

        final ExecutionOrderSubCommand executionOrderSubCommand = new ExecutionOrderSubCommand();
        executionOrderSubCommand.setInvoiceMainItemCode(source.getInvoiceMainItemCode());
        executionOrderSubCommand.setDescription(source.getDescription());
        executionOrderSubCommand.setUnitOfMeasurementCode(source.getUnitOfMeasurementCode());
        executionOrderSubCommand.setCurrencyCode(source.getCurrencyCode());
        executionOrderSubCommand.setMaterialGroupCode(source.getMaterialGroupCode());
        executionOrderSubCommand.setPersonnelNumberCode(source.getPersonnelNumberCode());
        executionOrderSubCommand.setLineTypeCode(source.getLineTypeCode());
        executionOrderSubCommand.setTotalQuantity(source.getTotalQuantity());
        executionOrderSubCommand.setAmountPerUnit(source.getAmountPerUnit());
        executionOrderSubCommand.setTotal(source.getTotalQuantity() * source.getAmountPerUnit());
       executionOrderSubCommand.setExternalServiceNumber(source.getExternalServiceNumber());
        executionOrderSubCommand.setServiceText(source.getServiceText());
        executionOrderSubCommand.setLineText(source.getLineText());
        executionOrderSubCommand.setLineNumber(source.getLineNumber());
        executionOrderSubCommand.setBiddersLine(source.getBiddersLine());
        executionOrderSubCommand.setSupplementaryLine(source.getSupplementaryLine());
        executionOrderSubCommand.setLotCostOne(source.getLotCostOne());
        executionOrderSubCommand.setDoNotPrint(source.getDoNotPrint());

        if (source.getServiceNumber() != null) {
            executionOrderSubCommand.setServiceNumberCode(source.getServiceNumber().getServiceNumberCode());
        }

        return executionOrderSubCommand;
    }
}
