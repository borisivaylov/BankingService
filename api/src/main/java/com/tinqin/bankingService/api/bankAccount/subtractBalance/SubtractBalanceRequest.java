package com.tinqin.bankingService.api.bankAccount.subtractBalance;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.tinqin.bankingService.api.base.OperationInput;
import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class SubtractBalanceRequest implements OperationInput {
    @JsonProperty("IBAN")
    private String IBAN;
    @JsonProperty("balance")
    private double balance;
}
