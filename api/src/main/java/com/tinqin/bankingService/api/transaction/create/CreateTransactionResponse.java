package com.tinqin.bankingService.api.transaction.create;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.tinqin.bankingService.api.base.OperationResult;
import lombok.*;
import org.yaml.snakeyaml.inspector.TagInspector;

import java.sql.Timestamp;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CreateTransactionResponse implements OperationResult {

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
}
