package com.tinqin.bankingService.api.bankAccount.getById;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.tinqin.bankingService.api.base.OperationResult;
import lombok.*;

import java.util.UUID;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class GetBankAccountByIdResponse implements OperationResult {
    @JsonProperty ("BankAccountId")
    private UUID BankAccountId;
    @JsonProperty("IBAN")
    private String IBAN; // ще трябва да се автоматизира генерирането на IBAN
    @JsonProperty("holderId")
    private UUID holderId;
    @JsonProperty("balance")
    private double balance;
    @JsonProperty ("Currency")
    private String currency;
}
