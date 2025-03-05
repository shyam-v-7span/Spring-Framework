package com.example.springDemo.Autowire;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class BankAccount {

    private String accountHolderName;
    private Double balance;
    private TransactionMessage transactionMessage;

    @Autowired  // Constructor-based Autowiring
    public BankAccount(TransactionMessage transactionMessage) {
        this.transactionMessage = transactionMessage;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }
    @Autowired
    public void setAccountHolderName(@Value("Ram") String accountHolderName) {
        System.out.println("accountHolderName setter called");
        this.accountHolderName = accountHolderName;
    }

    public Double getBalance() {
        return balance;
    }

    @Autowired
    public void setBalance(@Value("50000") Double balance) {
        System.out.println("balance setter called");
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
        transactionMessage.depositMessage(accountHolderName, amount);
        System.out.println("Current Balance: " + balance);
    }

    public void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Insufficient balance in " + accountHolderName + "'s account");
        } else {
            balance -= amount;
            transactionMessage.withdrawalMessage(accountHolderName, amount);
            System.out.println("Current Balance: " + balance);
        }
    }
}
