package com.quotation.app.service;

import com.quotation.app.mapper.ProductMapper;
import com.quotation.app.model.dto.ProductDto;
import com.quotation.app.model.entity.ProductEntity;
import com.quotation.app.repository.ProductRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductRepository repository;

    private final Logger LOGGER = LoggerFactory.getLogger(ProductServiceImpl.class);

    public void saveProduct(ProductDto productDto) {
        final ProductEntity entity = ProductMapper.INSTANCE.mapEntityFromDto(productDto);

        repository.save(entity);

        LOGGER.info("Produto salvo com sucesso", productDto);
    }

    public List<ProductDto> findAll() {
        List<ProductEntity> entities = repository.findAll();
        List<ProductDto> productDtos = new ArrayList<>();

        entities.forEach(productEntity -> {
            productDtos.add(ProductMapper.INSTANCE.mapDtoFromEntity(productEntity));
        });

        return productDtos;
    }
}
