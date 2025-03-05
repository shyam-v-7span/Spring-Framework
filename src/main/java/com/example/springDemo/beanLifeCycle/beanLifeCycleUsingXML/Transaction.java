package com.example.springDemo.beanLifeCycle.beanLifeCycleUsingXML;

public class Transaction {
    private int accountNumber;

    public Transaction(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void init() {
        System.out.println("init method called");
        System.out.println("Transaction started from account number: " + accountNumber);
    }

    public void processTransaction() {
        System.out.println("Processing transaction ");
    }

    // Destroy Method
    public void destroy() {
        System.out.println("destroy method called");
        System.out.println("Transaction ended of account number: " + accountNumber);
    }
}
