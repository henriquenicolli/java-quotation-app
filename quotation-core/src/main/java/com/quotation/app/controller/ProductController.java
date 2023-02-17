package com.quotation.app.controller;

import com.quotation.app.model.dto.ProductDto;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public interface ProductController {

   @PostMapping(value = "/save")
   ResponseEntity<String> saveProduct(@Valid @RequestBody ProductDto productDto);

   @GetMapping(value = "/findAll")
   List<ProductDto> getAll();

}
