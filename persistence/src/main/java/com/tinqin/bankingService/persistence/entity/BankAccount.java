package com.tinqin.bankingService.persistence.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.UUID;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "bankAccount")
public class BankAccount {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID bankAccountId;
    private UUID holderId;
    private String IBAN;
    private String currency;
    private double balance;
}
