package com.quotation.app.controller;

import com.quotation.app.model.dto.ProductDto;
import com.quotation.app.service.ProductServiceImpl;
import jakarta.validation.Valid;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/v1/products")
public class ProductControllerImpl implements ProductController {

    @Autowired
    private ProductServiceImpl productService;

    private static final Logger LOGGER = LoggerFactory.getLogger(ProductControllerImpl.class);
    
    @PostMapping(value = "/save")
    public ResponseEntity<String> saveProduct(@Valid @RequestBody ProductDto productDto) {
        LOGGER.info("Request para salvamento de produto recebido");

        productService.saveProduct(productDto);

        return ResponseEntity.accepted().build();
    }

    @GetMapping(value = "/findAll")
    public List<ProductDto> getAll() {
        LOGGER.info("Request para listar todos produtos recebido");
        return productService.findAll();
    }

}
