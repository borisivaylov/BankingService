package com.tinqin.bankingService.api.bankAccount.delete;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.tinqin.bankingService.api.base.OperationResult;
import lombok.*;

import java.util.UUID;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class DeleteBankAccountResponse implements OperationResult {

    @JsonProperty("status")
    private String status;
}
