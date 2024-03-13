package com.tinqin.bankingService.api.transaction.getByDateRange;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.tinqin.bankingService.api.base.OperationResult;
import lombok.*;

import java.sql.Timestamp;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class GetTransactionByDateRangeResponse implements OperationResult {
    @JsonProperty("transactionId")
    private String transactionId;
    @JsonProperty("liableName")
    private String liableName;
    @JsonProperty("liableIBAN")
    private String liableIBAN;
    @JsonProperty("receiverName")
    private String receiverName;
    @JsonProperty("receiverIBAN")
    private String receiverIBAN;
    @JsonProperty("sum")
    private String sum;
    @JsonProperty("reason")
    private String reason;
    @JsonProperty("transactionDate")
    private Timestamp transactionDate;
    @JsonProperty("reverted")
    private boolean reverted;
}
