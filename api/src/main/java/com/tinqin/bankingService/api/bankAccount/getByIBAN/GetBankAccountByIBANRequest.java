package com.tinqin.bankingService.api.bankAccount.getByIBAN;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.tinqin.bankingService.api.base.OperationInput;
import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class GetBankAccountByIBANRequest  implements OperationInput {
    @JsonProperty("IBAN")
    private String IBAN;
}
