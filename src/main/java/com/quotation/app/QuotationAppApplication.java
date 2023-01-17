package com.quotation.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

@EntityScan("com.quotation.app.model")
@ComponentScan(basePackages = "com.quotation.app")
@SpringBootApplication
public class QuotationAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(QuotationAppApplication.class, args);
	}

}
