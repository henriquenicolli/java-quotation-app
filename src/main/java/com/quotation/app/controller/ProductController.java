package com.quotation.app.controller;

import com.quotation.app.model.dto.ProductDto;
import com.quotation.app.service.ProductService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/products")
public class ProductController {

    @Autowired
    private ProductService productService;

    private Logger logger = LoggerFactory.getLogger(ProductController.class);

    @PostMapping(value = "/save")
    public ResponseEntity<String> saveProduct(@RequestBody ProductDto productDto) {
        logger.info("Request para salvamento de produto recebido", productDto);

        productService.saveProduct(productDto);

        return ResponseEntity.accepted().build();
    }

}
