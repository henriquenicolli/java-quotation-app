package com.quotation.app.model.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import jakarta.validation.constraints.NotBlank;

@Data
public class QuotationDto {

    @NotBlank(message = "The quotationName is required.")
    @JsonProperty(value="quotationName")
    private String quotationName;

    @NotBlank(message = "The expirationDate is required.")
    @JsonProperty(value="expirationDate")
    private String expirationDate;

    @NotBlank(message = "The deliveryDate is required.")
    @JsonProperty(value="deliveryDate")
    private String deliveryDate;

    @NotBlank(message = "The deliveryValue is required.")
    @JsonProperty(value="deliveryValue")
    private String deliveryValue;

    @JsonProperty(value="description")
    private String description;

    @JsonProperty(value="observation")
    private String observation;

}
