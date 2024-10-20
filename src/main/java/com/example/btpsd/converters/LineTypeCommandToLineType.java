package com.example.btpsd.converters;

import com.example.btpsd.commands.LineTypeCommand;
import com.example.btpsd.model.LineType;
import io.micrometer.common.lang.Nullable;
import lombok.RequiredArgsConstructor;
import lombok.Synchronized;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;
@RequiredArgsConstructor
@Component
public class LineTypeCommandToLineType implements Converter<LineTypeCommand, LineType> {


    @Synchronized
    @Nullable
    @Override
    public LineType convert(LineTypeCommand source) {

        if (source == null) {
            return null;
        }

        final LineType lineType = new LineType();
        lineType.setLineTypeCode(source.getLineTypeCode());
        lineType.setCode(source.getCode());
        lineType.setDescription(source.getDescription());
        return lineType;
    }
}
