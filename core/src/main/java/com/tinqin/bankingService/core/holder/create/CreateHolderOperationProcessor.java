package com.tinqin.bankingService.core.holder.create;

import com.tinqin.bankingService.api.holder.create.CreateHolderOperation;
import com.tinqin.bankingService.api.holder.create.CreateHolderRequest;
import com.tinqin.bankingService.api.holder.create.CreateHolderResponse;
import com.tinqin.bankingService.persistence.repository.BankAccountHolderRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CreateHolderOperationProcessor implements CreateHolderOperation {

    private final BankAccountHolderRepository bankAccountHolderRepository;
    @Override
    public CreateHolderResponse process(CreateHolderRequest operationInput) {
        return null;
    }
}
