package com.tinqin.bankingService.persistence.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;
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
    @OneToMany(mappedBy = "holderId", cascade = CascadeType.ALL)
    private List<BankAccount> bankAccountList;
    private String phoneNumber;
    private String address;
}
