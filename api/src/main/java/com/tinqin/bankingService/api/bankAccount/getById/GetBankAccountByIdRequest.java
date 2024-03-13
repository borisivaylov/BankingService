package com.tinqin.bankingService.api.bankAccount.getById;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.tinqin.bankingService.api.base.OperationInput;
import lombok.*;

import java.util.UUID;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class GetBankAccountByIdRequest implements OperationInput {
    @JsonProperty("BankAccountId")
    private UUID BankAccountId;
}
