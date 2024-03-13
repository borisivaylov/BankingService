package com.tinqin.bankingService.persistence.repository;

import com.tinqin.bankingService.persistence.entity.BankAccountHolder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.UUID;

public interface BankAccountHolderRepository extends JpaRepository<BankAccountHolder, UUID>, PagingAndSortingRepository<BankAccountHolder,UUID> {
}
