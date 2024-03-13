package com.tinqin.bankingService.persistence.entity;

import jakarta.persistence.*;
import lombok.*;

import java.sql.Timestamp;
import java.util.UUID;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "transaction")
public class BankTransaction {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID transactionId;
    private String liablePersonName;
    private String liableBankAccountIBAN;
    private String receiverPersonName;
    private String receiverBankAccountIBAN;
    private double sum;
    private String reason;
    private Timestamp transactionDate;
    private boolean reverted;
}
