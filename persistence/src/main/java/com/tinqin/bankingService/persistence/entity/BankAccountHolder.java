package com.tinqin.bankingService.persistence.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.Map;
import java.util.UUID;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "holder")
public class BankAccountHolder {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID holderId;
    private String holderName;
    @OneToMany
    private Map<UUID,BankAccount> bankAccountMap;
    private String phoneNumber;
    private String address;
}
