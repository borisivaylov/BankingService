package com.tinqin.bankingService.api.bankAccount.update;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.tinqin.bankingService.api.base.OperationResult;
import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UpdateBankAccountResponse implements OperationResult {
    @JsonProperty("status")
    private String status;
}
