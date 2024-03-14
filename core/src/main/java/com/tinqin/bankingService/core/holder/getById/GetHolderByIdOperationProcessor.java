package com.tinqin.bankingService.core.holder.getById;

import com.tinqin.bankingService.api.bankAccount.getByHolder.GetBankAccountByHolderRequest;
import com.tinqin.bankingService.api.bankAccount.getByHolder.GetBankAccountByHolderResponse;
import com.tinqin.bankingService.api.holder.getById.GetHolderByIdOperation;
import com.tinqin.bankingService.api.holder.getById.GetHolderByIdRequest;
import com.tinqin.bankingService.api.holder.getById.GetHolderByIdResponse;
import com.tinqin.bankingService.core.bankAccount.getByBankAccountHolder.GetBankAccountByHolderIdOperationProcessor;
import com.tinqin.bankingService.persistence.entity.BankAccountHolder;
import com.tinqin.bankingService.persistence.repository.BankAccountHolderRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;

@Service
@RequiredArgsConstructor
public class GetHolderByIdOperationProcessor implements GetHolderByIdOperation {

    private final BankAccountHolderRepository bankAccountHolderRepository;
    //private final BankAccountRepository bankAccountRepository;
    private final GetBankAccountByHolderIdOperationProcessor getBankAccountByHolderOperationProcessor;
    @Override
    public GetHolderByIdResponse process(GetHolderByIdRequest operationInput) {

        BankAccountHolder bankAccountHolder = bankAccountHolderRepository.findById(operationInput.getHolderId())
                .orElseThrow(()-> new NoSuchElementException("There is no BankAccountHolder with id: "
                                                                                +   operationInput.getHolderId()));


        List<GetBankAccountByHolderResponse> holderBankAccountsList = getBankAccountByHolderOperationProcessor
                                                                        .process(GetBankAccountByHolderRequest.builder()
                                                                                    .holderId(operationInput.getHolderId())
                                                                                    .build());

        /*
        List<BankAccount> holderBankAccounts = bankAccountRepository.findAllByHolderId(operationInput.getHolderId());

        if (holderBankAccounts.isEmpty()){
            throw  new NoSuchElementException("BankAccountHolder " + operationInput.getHolderId()
                                                                        + "doesn't have bank accounts");
        }


        List<GetBankAccountByHolderResponse> getBankAccountsByHolderResponses = new ArrayList<>();

        for (BankAccount currentBankAccount:holderBankAccounts) {
            getBankAccountsByHolderResponses.add(GetBankAccountByHolderResponse.builder()
                            .IBAN(currentBankAccount.getIBAN())
                            .balance(currentBankAccount.getBalance())
                            .currency(currentBankAccount.getCurrency())
                    .build());
        }
         */

        return GetHolderByIdResponse.builder()
                .holderId(bankAccountHolder.getHolderId())
                .name(bankAccountHolder.getHolderName())
                .phoneNumber(bankAccountHolder.getPhoneNumber())
                .address(bankAccountHolder.getAddress())
                .bankAccountsList(holderBankAccountsList)
                .build();
    }
}
