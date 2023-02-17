package com.quotation.app.model.dto;

import lombok.Data;

@Data
public class UserDto {

   private String name;

   private String cpf;

   private String email;

   private String numberPhone;

   private String function;

   private String login;

   private String password;

   private CompanyDto companyDto;

}
