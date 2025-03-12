package com.example.springDemo.constructorInjection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class BankAccount {

    private String accountHolderName;
    private Double balance;
    private TransactionMessage transactionMessage;

    public BankAccount(
            @Value("Shyam") String accountHolderName,
            @Value("5000.0") Double balance,
            TransactionMessage transactionMessage) {
        this.accountHolderName = accountHolderName;
        this.balance = balance;
        this.transactionMessage = transactionMessage;
    }

    public void deposit(double amount) {
        balance += amount;
        transactionMessage.depositMessage(accountHolderName, amount);
        System.out.println("Current Balance: " + balance);
    }

    public void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Insufficient balance in " + accountHolderName +"'s account");
        }
        else {
            balance -= amount;
            transactionMessage.withdrawalMessage(accountHolderName, amount);
            System.out.println("Current Balance: " + balance);
        }
    }
}
