package com.example.btpsd.commands;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
public class InvoiceMainItemCommand implements Serializable {

    private Long invoiceMainItemCode;

    private String uniqueId;

    private String salesQuotationItem;

    private String salesQuotationItemText;

    private String referenceSDDocument;

    private String referenceId;

    private Long serviceNumberCode;

    private String unitOfMeasurementCode;

    private String currencyCode;

    private String formulaCode;

    private String description;

    private Integer quantity;

    private Double amountPerUnit;

    private Double total;

    private Double totalHeader;

    private Double profitMargin;

    private Double totalWithProfit;

    private Boolean doNotPrint;

    private Double amountPerUnitWithProfit;

    private String temporaryDeletion;

//    private IntermediateMainItemCommand intermediateMainItemCommand;

    @JsonProperty("subItems")
    private List<InvoiceSubItemCommand> subItems = new ArrayList<>();

}
