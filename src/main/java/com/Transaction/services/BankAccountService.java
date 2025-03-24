package com.Transaction.services;

import com.Transaction.entities.BankAccount;
import com.Transaction.repository.BankAccountRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class BankAccountService {
    @Autowired
    BankAccountRepo bankAccountRepo;

    @Transactional
    public void transfer(double amount) {
        BankAccount bankAccount = bankAccountRepo.findById(1).orElseThrow();
        bankAccount.setName("Shyam");
        bankAccount.setAmount(bankAccount.getAmount() - amount);
        bankAccountRepo.save(bankAccount);

        // Simulate exception
        if (true) {
            throw new RuntimeException();
        }

        BankAccount bankAccount2 = bankAccountRepo.findById(2).orElseThrow();
        bankAccount2.setName("john");
        bankAccount2.setAmount(bankAccount.getAmount() + amount);
        bankAccountRepo.save(bankAccount2);
    }
}



