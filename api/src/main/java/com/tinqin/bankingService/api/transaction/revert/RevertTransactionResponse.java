package com.tinqin.bankingService.api.transaction.revert;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.tinqin.bankingService.api.base.OperationResult;
import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class RevertTransactionResponse implements OperationResult {
    @JsonProperty("status")
    private String status;
}
