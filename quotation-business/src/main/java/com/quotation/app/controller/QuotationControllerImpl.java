package com.quotation.app.controller;

import com.quotation.app.model.dto.QuotationDto;
import com.quotation.app.service.QuotationServiceImpl;
import jakarta.validation.Valid;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/v1/quotations")
public class QuotationControllerImpl implements QuotationController {

    @Autowired
    private QuotationServiceImpl quotationService;

    private static final Logger LOGGER = LoggerFactory.getLogger(ProductControllerImpl.class);

    @PostMapping(value = "/save")
    public ResponseEntity<String> saveQuotation(@Valid @RequestBody QuotationDto quotationDto) {
        LOGGER.info("Request para salvamento de cotacao recebido");

        quotationService.saveQuotation(quotationDto);

        return ResponseEntity.accepted().build();
    }

    @GetMapping(value = "/findAll")
    public List<QuotationDto> getAll() {
        LOGGER.info("Request para listagem de cotacoes recebido");
        return quotationService.findAll();
    }

}
