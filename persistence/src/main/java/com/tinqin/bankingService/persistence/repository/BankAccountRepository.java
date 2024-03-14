package com.tinqin.bankingService.persistence.repository;

import com.tinqin.bankingService.persistence.entity.BankAccount;
import com.tinqin.bankingService.persistence.entity.BankAccountHolder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface BankAccountRepository extends JpaRepository<BankAccount, UUID>, PagingAndSortingRepository<BankAccount,UUID> {

    Optional<BankAccount> findByIBAN(String IBAN);
    List<BankAccount> findAllByHolderId(UUID holderId);
}
