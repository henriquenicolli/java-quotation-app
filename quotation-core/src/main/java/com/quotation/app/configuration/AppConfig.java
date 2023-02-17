package com.quotation.app.configuration;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@EntityScan("com.quotation.app.model")
@ComponentScan(basePackages = "com.quotation.app")
public class AppConfig {
}
