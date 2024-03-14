package com.tinqin.bankingService.core.bankAccount.delete;

import com.tinqin.bankingService.api.bankAccount.delete.DeleteBankAccountOperation;
import com.tinqin.bankingService.api.bankAccount.delete.DeleteBankAccountRequest;
import com.tinqin.bankingService.api.bankAccount.delete.DeleteBankAccountResponse;
import com.tinqin.bankingService.api.base.OperationProcessor;
import com.tinqin.bankingService.persistence.entity.BankAccount;
import com.tinqin.bankingService.persistence.repository.BankAccountRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.NoSuchElementException;

@Service
@RequiredArgsConstructor
public class DeleteBankAccountOperationProcessor implements DeleteBankAccountOperation {

    private final BankAccountRepository bankAccountRepository;

    @Override
    public DeleteBankAccountResponse process(DeleteBankAccountRequest operationInput) {

        BankAccount bankAccount = bankAccountRepository.findById(operationInput.getBankAccountId())
                .orElseThrow(()-> new NoSuchElementException("Bank account "+ operationInput.getBankAccountId()
                                                                                                    + "doesn't exist."));
        bankAccountRepository.delete(bankAccount);

        return DeleteBankAccountResponse.builder()
                .status("Bank account " + operationInput.getBankAccountId()+ "successfully deleted.")
                .build();
    }
}
