package com.tinqin.bankingService.api.holder.update;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.tinqin.bankingService.api.base.OperationResult;
import lombok.*;

import java.util.UUID;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UpdateHolderResponse implements OperationResult {
    @JsonProperty("holderId")
    private UUID holderId;
    @JsonProperty("name:")
    private String name;
    @JsonProperty("phoneNumber:")
    private String phoneNumber;
    @JsonProperty("address:")
    private String address;
}
