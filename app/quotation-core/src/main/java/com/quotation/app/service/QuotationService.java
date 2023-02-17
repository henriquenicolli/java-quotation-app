package com.quotation.app.service;

import com.quotation.app.model.dto.QuotationDto;
import java.util.List;

public interface QuotationService {

   void saveQuotation(QuotationDto quotationDto);

   List<QuotationDto> findAll();

}
