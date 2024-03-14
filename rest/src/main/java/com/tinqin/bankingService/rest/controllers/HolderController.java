package com.tinqin.bankingService.rest.controllers;

import com.tinqin.bankingService.api.bankAccount.delete.DeleteBankAccountRequest;
import com.tinqin.bankingService.api.holder.create.CreateHolderRequest;
import com.tinqin.bankingService.api.holder.create.CreateHolderResponse;
import com.tinqin.bankingService.api.holder.delete.DeleteHolderRequest;
import com.tinqin.bankingService.api.holder.delete.DeleteHolderResponse;
import com.tinqin.bankingService.api.holder.getById.GetHolderByIdRequest;
import com.tinqin.bankingService.api.holder.getById.GetHolderByIdResponse;
import com.tinqin.bankingService.api.holder.update.UpdateHolderRequest;
import com.tinqin.bankingService.api.holder.update.UpdateHolderResponse;
import com.tinqin.bankingService.core.bankAccount.delete.DeleteBankAccountOperationProcessor;
import com.tinqin.bankingService.core.holder.create.CreateHolderOperationProcessor;
import com.tinqin.bankingService.core.holder.delete.DeleteHolderOperationProcessor;
import com.tinqin.bankingService.core.holder.getById.GetHolderByIdOperationProcessor;
import com.tinqin.bankingService.core.holder.update.UpdateHolderOperationProcessor;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/bankHolder")
@RequiredArgsConstructor
public class HolderController {

    private final CreateHolderOperationProcessor createHolderOperationProcessor;
    private final UpdateHolderOperationProcessor updateHolderOperationProcessor;
    private final GetHolderByIdOperationProcessor getHolderByIdOperationProcessor;

    @PostMapping("/create")
    CreateHolderResponse createBankHolder(@RequestBody CreateHolderRequest createHolderRequest){
        return createHolderOperationProcessor.process(createHolderRequest);
    }
    @PostMapping("/update")
    UpdateHolderResponse updateBankHolder (@RequestBody UpdateHolderRequest updateHolderRequest){
        return updateHolderOperationProcessor.process(updateHolderRequest);
    }

    @PostMapping("/getById")
    GetHolderByIdResponse getHolderById(@RequestBody GetHolderByIdRequest getHolderByIdRequest){
        return getHolderByIdOperationProcessor.process(getHolderByIdRequest);
    }
}
