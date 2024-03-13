package com.tinqin.bankingService.api.transaction.getById;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.tinqin.bankingService.api.base.OperationInput;
import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class GetTransactionByIdRequest implements OperationInput {
    @JsonProperty("transactionId")
    private String transactionId;

}
