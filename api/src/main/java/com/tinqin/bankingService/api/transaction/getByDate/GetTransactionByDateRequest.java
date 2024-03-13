package com.tinqin.bankingService.api.transaction.getByDate;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.tinqin.bankingService.api.base.OperationInput;
import lombok.*;

import java.sql.Timestamp;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class GetTransactionByDateRequest implements OperationInput {

    @JsonProperty("transactionDate")
    private Timestamp transactionDate;

}
