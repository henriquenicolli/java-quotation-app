package com.quotation.app.service;

import com.quotation.app.mapper.QuotationMapper;
import com.quotation.app.model.dto.QuotationDto;
import com.quotation.app.model.entity.QuotationEntity;
import com.quotation.app.repository.QuotationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class QuotationService {

    @Autowired
    private QuotationRepository repository;

    public void saveQuotation(QuotationDto quotationDto) {
        QuotationEntity entity = QuotationMapper.INSTANCE.mapEntityFromDto(quotationDto);

        repository.save(entity);
    }

    public List<QuotationDto> findAll() {
        List<QuotationEntity> entities = repository.findAll();
        List<QuotationDto> quotationDtos = new ArrayList<>();

        entities.forEach(quotationEntity -> {
            quotationDtos.add(QuotationMapper.INSTANCE.mapDtoFromEntity(quotationEntity));
        });

        return quotationDtos;
    }

}
