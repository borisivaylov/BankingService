package com.tinqin.bankingService.api.holder.getById;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.tinqin.bankingService.api.base.OperationInput;
import lombok.*;

import java.util.UUID;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class GetHolderByIdRequest implements OperationInput {
    @JsonProperty("holderId")
    private UUID holderId;
}
