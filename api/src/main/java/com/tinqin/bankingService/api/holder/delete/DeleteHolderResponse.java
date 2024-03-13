package com.tinqin.bankingService.api.holder.delete;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.tinqin.bankingService.api.base.OperationResult;
import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class DeleteHolderResponse implements OperationResult {
    @JsonProperty("status")
    private String status;
}
