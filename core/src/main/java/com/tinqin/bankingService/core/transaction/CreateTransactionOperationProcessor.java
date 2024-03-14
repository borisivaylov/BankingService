package com.tinqin.bankingService.core.transaction;

import com.tinqin.bankingService.api.transaction.create.CreateTransactionOperation;
import com.tinqin.bankingService.api.transaction.create.CreateTransactionRequest;
import com.tinqin.bankingService.api.transaction.create.CreateTransactionResponse;
import com.tinqin.bankingService.persistence.repository.BankTransactionRepository;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CreateTransactionOperationProcessor implements CreateTransactionOperation {

    private final BankTransactionRepository bankTransactionRepository;

    @Override
    public CreateTransactionResponse process(CreateTransactionRequest operationInput) {



        return null ;
    }
}
