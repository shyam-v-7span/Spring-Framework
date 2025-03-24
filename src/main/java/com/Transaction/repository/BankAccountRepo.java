package com.Transaction.repository;

import com.Transaction.entities.BankAccount;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BankAccountRepo extends JpaRepository<BankAccount,Integer> {
}
