package com.tinqin.bankingService.api.bankAccount.getByHolder;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.tinqin.bankingService.api.base.OperationInput;
import lombok.*;

import java.util.UUID;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class GetBankAccountByHolderRequest implements OperationInput {
    @JsonProperty("holderId")
    private UUID holderId;
}
