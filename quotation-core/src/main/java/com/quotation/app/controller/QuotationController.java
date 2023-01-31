package com.quotation.app.controller;

import com.quotation.app.model.dto.QuotationDto;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public interface QuotationController {

   @PostMapping(value = "/save")
   ResponseEntity<String> saveQuotation(@Valid @RequestBody QuotationDto quotationDto);

   @GetMapping(value = "/findAll")
   List<QuotationDto> getAll();

}
