package com.example.springDemo.constructorInjection;

public class BankAccount {

    private String accountHolderName;
    private Double balance;
    private TransactionMessage transactionMessage;

    public BankAccount(String accountHolderName, Double amount,TransactionMessage transactionMessage){
        this.accountHolderName = accountHolderName;
        this.balance = amount;
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
