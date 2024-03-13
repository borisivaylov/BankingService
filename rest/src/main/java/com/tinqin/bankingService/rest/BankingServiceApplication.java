package com.tinqin.bankingService.rest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@ComponentScan(basePackages = {"com.tinqin"})
@EntityScan(basePackages = {"com.tinqin.bankingService.persistence.entity"})
@EnableJpaRepositories(basePackages = {"com.tinqin.bankingService.persistence.repository"})
@SpringBootApplication
public class BankingServiceApplication {
    public static void main(String[] args) {
        SpringApplication.run(BankingServiceApplication.class, args);
    }
}