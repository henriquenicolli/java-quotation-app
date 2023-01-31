package com.quotation.app.service;

import com.quotation.app.model.dto.ProductDto;
import java.util.List;

public interface ProductService {

   void saveProduct(ProductDto productDto);

   List<ProductDto> findAll();

}
