package com.tinqin.bankingService.core.bankAccount.update;

import com.tinqin.bankingService.api.bankAccount.update.UpdateBankAccountOperation;
import com.tinqin.bankingService.api.bankAccount.update.UpdateBankAccountRequest;
import com.tinqin.bankingService.api.bankAccount.update.UpdateBankAccountResponse;
import com.tinqin.bankingService.api.base.OperationProcessor;
import com.tinqin.bankingService.persistence.entity.BankAccount;
import com.tinqin.bankingService.persistence.repository.BankAccountRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.NoSuchElementException;

@Service
@RequiredArgsConstructor
public class UpdateBankAccountOperationProcessor implements UpdateBankAccountOperation {

    private final BankAccountRepository bankAccountRepository;

    @Override
    public UpdateBankAccountResponse process(UpdateBankAccountRequest operationInput) {

        BankAccount bankAccount = bankAccountRepository.findById(operationInput.getBankAccountId())
                .orElseThrow(()-> new NoSuchElementException("Bank account "+ operationInput.getBankAccountId()
                                                                                            + "doesn't exist."));

        bankAccount.setHolderId(operationInput.getHolderId());

        bankAccountRepository.save(bankAccount);

        return UpdateBankAccountResponse.builder()
                .status("Successfully updated account holder id to "+bankAccount.getHolderId())
                .build();
    }
}
