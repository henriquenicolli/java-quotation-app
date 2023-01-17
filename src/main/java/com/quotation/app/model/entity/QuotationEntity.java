package com.quotation.app.model.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Getter
@Setter
@Entity(name = "tbl_quotation")
public class QuotationEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name="expiration_date")
    private LocalDateTime expirationDate;

    @Column(name="delivery_date")
    private LocalDate deliveryDate;

    @Column(name="delivery_price")
    private BigDecimal deliveryValue;

    @Column(name="description")
    private String description;

    @Column(name="observation")
    private String observation;

}
