package com.tinqin.bankingService.api.holder.create;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.tinqin.bankingService.api.bankAccount.getByHolder.GetBankAccountByHolderResponse;
import com.tinqin.bankingService.api.base.OperationResult;
import lombok.*;

import java.util.List;
import java.util.UUID;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CreateHolderResponse implements OperationResult {

    @JsonProperty("holderId")
    private UUID holderId;
    @JsonProperty("name:")
    private String name;
    @JsonProperty("phoneNumber:")
    private String phoneNumber;
    @JsonProperty("address:")
    private String address;
    @JsonProperty("bankAccounts")
    private List<GetBankAccountByHolderResponse> bankAccountsList;
}
