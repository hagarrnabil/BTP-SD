package com.example.btpsd.commands;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import com.fasterxml.jackson.annotation.JsonIgnore;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
public class SubItemCommand implements Serializable {

    private Long subItemCode;

    private Long mainItemCode;

    private Long serviceNumberCode;

    private String unitOfMeasurementCode;

    private String currencyCode;

    private String formulaCode;

    private String description;

    private Integer quantity;

    private Double amountPerUnit;

    private Double total;


}