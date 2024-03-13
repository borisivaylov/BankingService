package com.tinqin.bankingService.persistence.repository;

import com.tinqin.bankingService.persistence.entity.BankTransaction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.UUID;

public interface BankTransactionRepository extends JpaRepository<BankTransaction, UUID>, PagingAndSortingRepository<BankTransaction,UUID> {
}
