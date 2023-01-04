package com.quotation.app.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
@Entity(name = "tbl_product")
public class ProductEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @Column(name="quantity")
    private int quantity;
    @Column(name="cod_product")
    private String productCode;
    @Column(name="price")
    private BigDecimal valor;
    @Column(name="description")
    private String description;

}
