package com.tinqin.bankingService.api.bankAccount.addBalance;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.tinqin.bankingService.api.base.OperationInput;
import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AddBalanceToAccountRequest implements OperationInput {

    @JsonProperty("IBAN")
    private String IBAN;
    @JsonProperty("balance")
    private double balance;
}
