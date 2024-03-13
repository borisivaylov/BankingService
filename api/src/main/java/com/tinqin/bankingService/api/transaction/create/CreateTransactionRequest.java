package com.tinqin.bankingService.api.transaction.create;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.tinqin.bankingService.api.base.OperationInput;
import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CreateTransactionRequest implements OperationInput {

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

}
