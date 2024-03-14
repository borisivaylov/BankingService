package com.tinqin.bankingService.core.bankAccount.getByBankAccountHolder;

import com.tinqin.bankingService.api.bankAccount.getByHolder.GetBankAccountByHolderOperation;
import com.tinqin.bankingService.api.bankAccount.getByHolder.GetBankAccountByHolderRequest;
import com.tinqin.bankingService.api.bankAccount.getByHolder.GetBankAccountByHolderResponse;
import com.tinqin.bankingService.persistence.entity.BankAccount;
import com.tinqin.bankingService.persistence.repository.BankAccountRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

@Service
@RequiredArgsConstructor
public class GetBankAccountByHolderIdOperationProcessor implements GetBankAccountByHolderOperation {

    private final BankAccountRepository bankAccountRepository;
    @Override
    public List<GetBankAccountByHolderResponse> process(GetBankAccountByHolderRequest operationInput) {

        List<BankAccount> bankAccounts = bankAccountRepository.findAllByHolderId(operationInput.getHolderId());

        if (bankAccounts.isEmpty()){
            throw  new NoSuchElementException("BankAccountHolder " + operationInput.getHolderId()
                    + "doesn't have bank accounts");
        }

        List<GetBankAccountByHolderResponse> getBankAccountsByHolderResponses = new ArrayList<>();

        for (BankAccount currentBankAccount:bankAccounts) {
            getBankAccountsByHolderResponses.add(GetBankAccountByHolderResponse.builder()
                    .BankAccountId(currentBankAccount.getBankAccountId())
                    .IBAN(currentBankAccount.getIBAN())
                    .holderId(currentBankAccount.getHolderId())
                    .balance(currentBankAccount.getBalance())
                    .currency(currentBankAccount.getCurrency())
                    .build());
        }


        return getBankAccountsByHolderResponses;
    }
}
