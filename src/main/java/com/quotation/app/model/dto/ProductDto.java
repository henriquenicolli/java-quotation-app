package com.quotation.app.model.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;


@Data
public class ProductDto {

    @JsonProperty(value="quantity")
    private int quantity;

    @JsonProperty(value="cod_product")
    private String productCode;

    @JsonProperty(value="price")
    private String valor;

    @JsonProperty(value="description")
    private String description;

}
