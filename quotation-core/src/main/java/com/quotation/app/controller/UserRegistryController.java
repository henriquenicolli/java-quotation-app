package com.quotation.app.controller;

import com.quotation.app.model.dto.UserDto;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

public interface UserRegistryController {

   @PostMapping("/createUser")
   ResponseEntity<String> createUser(@Valid @RequestBody UserDto user);

}
