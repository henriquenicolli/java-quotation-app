package com.quotation.app.mapper;

import com.quotation.app.model.dto.ProductDto;
import com.quotation.app.model.entity.ProductEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface ProductMapper {

    ProductMapper INSTANCE = Mappers.getMapper( ProductMapper.class );

    @Mapping(source = "productName", target = "productName")
    @Mapping(source = "quantity", target = "quantity")
    @Mapping(source = "productCode", target = "productCode")
    @Mapping(source = "valor", target = "valor")
    @Mapping(source = "description", target = "description")
    ProductEntity mapEntityFromDto(ProductDto source);

    @Mapping(source = "productName", target = "productName")
    @Mapping(source = "quantity", target = "quantity")
    @Mapping(source = "productCode", target = "productCode")
    @Mapping(source = "valor", target = "valor")
    @Mapping(source = "description", target = "description")
    ProductDto mapDtoFromEntity(ProductEntity roductEntity);

}
