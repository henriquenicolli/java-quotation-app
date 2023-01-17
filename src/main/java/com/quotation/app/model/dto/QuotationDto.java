package com.quotation.app.model.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class QuotationDto {

    @JsonProperty(value="expiration_date")
    private String expirationDate;

    @JsonProperty(value="delivery_date")
    private String deliveryDate;

    @JsonProperty(value="delivery_value")
    private String deliveryValue;

    @JsonProperty(value="description")
    private String description;

    @JsonProperty(value="observation")
    private String observation;


}
