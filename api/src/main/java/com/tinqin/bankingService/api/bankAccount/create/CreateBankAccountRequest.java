package com.tinqin.bankingService.api.bankAccount.create;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.tinqin.bankingService.api.base.OperationInput;
import lombok.*;

import java.util.UUID;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CreateBankAccountRequest implements OperationInput {

    @JsonProperty("holderId")
    private UUID holderId;
    @JsonProperty ("Currency")
    private String currency;   // Може да се използва и enum,
                                // ще влезе в превалутирането при преводи

}
