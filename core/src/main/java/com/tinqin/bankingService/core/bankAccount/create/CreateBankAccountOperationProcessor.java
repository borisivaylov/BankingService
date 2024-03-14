package com.tinqin.bankingService.core.bankAccount.create;

import com.tinqin.bankingService.api.bankAccount.create.CreateBankAccountOperation;
import com.tinqin.bankingService.api.bankAccount.create.CreateBankAccountRequest;
import com.tinqin.bankingService.api.bankAccount.create.CreateBankAccountResponse;
import com.tinqin.bankingService.persistence.entity.BankAccount;
import com.tinqin.bankingService.persistence.entity.BankAccountHolder;
import com.tinqin.bankingService.persistence.repository.BankAccountHolderRepository;
import com.tinqin.bankingService.persistence.repository.BankAccountRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.NoSuchElementException;

@Service
@RequiredArgsConstructor
public class CreateBankAccountOperationProcessor implements CreateBankAccountOperation {

    private final BankAccountRepository bankAccountRepository;
    private final BankAccountHolderRepository bankAccountHolderRepository;
    @Override
    public CreateBankAccountResponse process(CreateBankAccountRequest operationInput) {

        //bankAccountRepository.findByIBAN(operationInput.getIBAN())

                if(bankAccountRepository.findByIBAN(operationInput.getIBAN()).isPresent()){
                    throw  new IllegalArgumentException("There is a bank account with IBAN "
                            + operationInput.getIBAN() + " already registered");
                }

        BankAccountHolder bankAccountHolder = bankAccountHolderRepository.findById(operationInput.getHolderId())
                .orElseThrow(()-> new NoSuchElementException("There is no banking holder with id: "+ operationInput.getHolderId()));

        BankAccount bankAccount = BankAccount.builder()
                .holderId(bankAccountHolder.getHolderId())
                .IBAN(operationInput.getIBAN())
                .balance(0.0)
                .currency("BGN")
                .build();

        bankAccountRepository.save(bankAccount);

        return CreateBankAccountResponse.builder()
                .BankAccountId(bankAccount.getBankAccountId())
                .holderId(bankAccount.getHolderId())
                .balance(bankAccount.getBalance())
                .IBAN(bankAccount.getIBAN())
                .currency(bankAccount.getCurrency())
                .build();
    }
}
