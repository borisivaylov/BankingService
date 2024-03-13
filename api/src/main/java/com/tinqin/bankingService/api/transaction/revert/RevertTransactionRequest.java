package com.tinqin.bankingService.api.transaction.revert;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.tinqin.bankingService.api.base.OperationInput;
import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class RevertTransactionRequest implements OperationInput {
    @JsonProperty("transactionId")
    private String transactionId;
}
