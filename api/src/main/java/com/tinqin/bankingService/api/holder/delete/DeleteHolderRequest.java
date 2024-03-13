package com.tinqin.bankingService.api.holder.delete;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.tinqin.bankingService.api.base.OperationInput;
import lombok.*;

import java.util.UUID;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class DeleteHolderRequest implements OperationInput {
    @JsonProperty("holderId")
    private UUID uuid;
}
