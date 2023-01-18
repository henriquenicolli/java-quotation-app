package com.quotation.app.controller;

import com.quotation.app.model.dto.QuotationDto;
import com.quotation.app.service.QuotationService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v1/quotations")
public class QuotationController {

    @Autowired
    private QuotationService quotationService;

    private static final Logger LOGGER = LoggerFactory.getLogger(ProductController.class);

    @PostMapping(value = "/save")
    public ResponseEntity<String> saveQuotation(@RequestBody QuotationDto quotationDto) {
        LOGGER.info("Request para salvamento de cotacao recebido");

        quotationService.saveQuotation(quotationDto);

        return ResponseEntity.accepted().build();
    }

    @CrossOrigin
    @GetMapping(value = "/findAll")
    public List<QuotationDto> getAll() {
        LOGGER.info("Request para listagem de cotacoes recebido");
        return quotationService.findAll();
    }

}
