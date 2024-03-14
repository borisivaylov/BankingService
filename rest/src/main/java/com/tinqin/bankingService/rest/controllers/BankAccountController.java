package com.tinqin.bankingService.rest.controllers;

import com.tinqin.bankingService.api.bankAccount.create.CreateBankAccountRequest;
import com.tinqin.bankingService.api.bankAccount.create.CreateBankAccountResponse;
import com.tinqin.bankingService.api.bankAccount.delete.DeleteBankAccountRequest;
import com.tinqin.bankingService.api.bankAccount.delete.DeleteBankAccountResponse;
import com.tinqin.bankingService.api.bankAccount.getByHolder.GetBankAccountByHolderRequest;
import com.tinqin.bankingService.api.bankAccount.getByHolder.GetBankAccountByHolderResponse;
import com.tinqin.bankingService.api.bankAccount.update.UpdateBankAccountRequest;
import com.tinqin.bankingService.api.bankAccount.update.UpdateBankAccountResponse;
import com.tinqin.bankingService.core.bankAccount.create.CreateBankAccountOperationProcessor;
import com.tinqin.bankingService.core.bankAccount.delete.DeleteBankAccountOperationProcessor;
import com.tinqin.bankingService.core.bankAccount.getByBankAccountHolder.GetBankAccountByHolderIdOperationProcessor;
import com.tinqin.bankingService.core.bankAccount.update.UpdateBankAccountOperationProcessor;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/bankAccount")
@RequiredArgsConstructor
public class BankAccountController {

    private final CreateBankAccountOperationProcessor createBankAccountOperationProcessor;
    private final GetBankAccountByHolderIdOperationProcessor getBankAccountByHolderOperationProcessor;
    private final UpdateBankAccountOperationProcessor updateBankAccountOperationProcessor;
    private final DeleteBankAccountOperationProcessor deleteBankAccountOperationProcessor;

    @PostMapping("/create")
    CreateBankAccountResponse createBankAccount(@RequestBody CreateBankAccountRequest createBankAccountRequest){
        return createBankAccountOperationProcessor.process(createBankAccountRequest);
    }
    //@PostMapping("/update")
    @PostMapping("/getByHolderId")
    List<GetBankAccountByHolderResponse> getBankAccountByHolderId(@RequestBody GetBankAccountByHolderRequest getBankAccountByHolderRequest){
        return getBankAccountByHolderOperationProcessor.process(getBankAccountByHolderRequest);
    }
    @PostMapping("/update")
    UpdateBankAccountResponse updateBankAccount(@RequestBody UpdateBankAccountRequest updateBankAccountRequest){
        return updateBankAccountOperationProcessor.process(updateBankAccountRequest);
    }

    @PostMapping("/delete")
    DeleteBankAccountResponse deleteBankAccount(@RequestBody DeleteBankAccountRequest deleteBankAccountRequest){
        return deleteBankAccountOperationProcessor.process(deleteBankAccountRequest);
    }


}
