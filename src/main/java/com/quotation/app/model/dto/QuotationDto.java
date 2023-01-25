package com.quotation.app.model.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class QuotationDto {

    @JsonProperty(value="quotationName")
    private String quotationName;

    @JsonProperty(value="expirationDate")
    private String expirationDate;

    @JsonProperty(value="deliveryDate")
    private String deliveryDate;

    @JsonProperty(value="deliveryValue")
    private String deliveryValue;

    @JsonProperty(value="description")
    private String description;

    @JsonProperty(value="observation")
    private String observation;


}
