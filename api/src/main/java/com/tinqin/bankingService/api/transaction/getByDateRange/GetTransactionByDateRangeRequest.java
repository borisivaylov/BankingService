package com.tinqin.bankingService.api.transaction.getByDateRange;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.tinqin.bankingService.api.base.OperationInput;
import lombok.*;

import java.sql.Timestamp;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class GetTransactionByDateRangeRequest implements OperationInput {
    @JsonProperty("fromDate")
    private Timestamp fromDate;
    @JsonProperty("toDate")
    private Timestamp toDate;
}
