package com.tinqin.bankingService.core.holder.update;

import com.tinqin.bankingService.api.holder.update.UpdateHolderOperation;
import com.tinqin.bankingService.api.holder.update.UpdateHolderRequest;
import com.tinqin.bankingService.api.holder.update.UpdateHolderResponse;
import com.tinqin.bankingService.persistence.entity.BankAccountHolder;
import com.tinqin.bankingService.persistence.repository.BankAccountHolderRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.NoSuchElementException;

@Service
@RequiredArgsConstructor
public class UpdateHolderOperationProcessor implements UpdateHolderOperation {

    private final BankAccountHolderRepository bankAccountHolderRepository;

    @Override
    public UpdateHolderResponse process(UpdateHolderRequest operationInput) {

        BankAccountHolder bankAccountHolder = bankAccountHolderRepository.findById(operationInput.getHolderId())
                .orElseThrow(()-> new NoSuchElementException("There is no BankAccountHolder with id: "
                                                                                        + operationInput.getHolderId()));

        bankAccountHolder.setHolderName(operationInput.getName());
        bankAccountHolder.setAddress(operationInput.getAddress());
        bankAccountHolder.setPhoneNumber(operationInput.getPhoneNumber());


        bankAccountHolderRepository.save(bankAccountHolder);

        return UpdateHolderResponse.builder()
                .holderId(bankAccountHolder.getHolderId())
                .name(bankAccountHolder.getHolderName())
                .address(bankAccountHolder.getAddress())
                .phoneNumber(bankAccountHolder.getPhoneNumber())
                .build();
    }

}
