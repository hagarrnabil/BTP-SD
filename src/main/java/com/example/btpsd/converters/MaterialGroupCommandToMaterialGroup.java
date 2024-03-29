package com.example.btpsd.converters;

import com.example.btpsd.commands.MaterialGroupCommand;
import com.example.btpsd.model.MaterialGroup;
import io.micrometer.common.lang.Nullable;
import lombok.RequiredArgsConstructor;
import lombok.Synchronized;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@RequiredArgsConstructor
@Component
public class MaterialGroupCommandToMaterialGroup implements Converter<MaterialGroupCommand, MaterialGroup> {

    private final ModelSpecDetailsCommandToModelSpecDetails modelSpecDetailsConverter;

    private final ServiceNumberCommandToServiceNumber serviceNumberConverter;

    @Synchronized
    @Nullable
    @Override
    public MaterialGroup convert(MaterialGroupCommand source) {

        if (source == null) {
            return null;
        }

        final MaterialGroup materialGroup = new MaterialGroup();
        materialGroup.setMaterialGroupCode(source.getMaterialGroupCode());
        materialGroup.setCode(source.getCode());
        materialGroup.setDescription(source.getDescription());
        if (source.getModelSpecificationsDetailsCommands() != null && source.getModelSpecificationsDetailsCommands().size() > 0) {
            source.getModelSpecificationsDetailsCommands()
                    .forEach(modelSpecificationsDetailsCommand -> materialGroup.getModelSpecificationsDetails().add(modelSpecDetailsConverter.convert(modelSpecificationsDetailsCommand)));
        }
        if (source.getServiceNumberCommands() != null && source.getServiceNumberCommands().size() > 0) {
            source.getServiceNumberCommands()
                    .forEach(serviceNumberCommand -> materialGroup.getServiceNumbers().add(serviceNumberConverter.convert(serviceNumberCommand)));
        }
        return materialGroup;
    }
}

