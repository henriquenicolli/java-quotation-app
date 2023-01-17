package com.quotation.app.mapper;

import com.quotation.app.model.dto.QuotationDto;
import com.quotation.app.model.entity.QuotationEntity;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

public interface QuotationMapper {

    QuotationMapper INSTANCE = Mappers.getMapper(QuotationMapper.class);

    @Mapping(source = "expirationDate", target = "expirationDate")
    @Mapping(source = "deliveryDate", target = "deliveryDate")
    @Mapping(source = "deliveryValue", target = "deliveryValue")
    @Mapping(source = "description", target = "description")
    @Mapping(source = "observation", target = "observation")
    QuotationEntity mapEntityFromDto(QuotationDto source);

    @Mapping(source = "expirationDate", target = "expirationDate")
    @Mapping(source = "deliveryDate", target = "deliveryDate")
    @Mapping(source = "deliveryValue", target = "deliveryValue")
    @Mapping(source = "description", target = "description")
    @Mapping(source = "observation", target = "observation")
    QuotationDto mapDtoFromEntity(QuotationEntity entity);
}
