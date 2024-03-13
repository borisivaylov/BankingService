package com.tinqin.bankingService.api.holder.create;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.tinqin.bankingService.api.base.OperationInput;
import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CreateHolderRequest implements OperationInput {

    @JsonProperty("name:")
    private String name;
    @JsonProperty("phoneNumber:")
    private String phoneNumber;
    @JsonProperty("address:")
    private String address;

}
