package com.quotation.app.model.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class ProductDto {

    @NotBlank(message = "The productName is required.")
    @JsonProperty(value = "productName")
    private String productName;

    @JsonProperty(value="quantity")
    private int quantity;

    @NotBlank(message = "The productCode is required.")
    @JsonProperty(value="productCode")
    private String productCode;

    @JsonProperty(value="price")
    private String valor;

    @JsonProperty(value="description")
    private String description;

}
