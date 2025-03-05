package com.example.springDemo.beanLifeCycle.beanLifeCycleUsingAnnotations;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;

@Component
public class Transaction {
    private int accountNumber;

    public Transaction(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    // init method
    @PostConstruct
    public void afterPropertiesSet() throws Exception {
        System.out.println("init method called");
        System.out.println("Transaction started from account number: " + accountNumber);
    }

    public void processTransaction() {
        System.out.println("Processing transaction ");
    }

    @PreDestroy
    public void destroy() throws Exception {
        System.out.println("destroy method called");
        System.out.println("Transaction ended of account number: " + accountNumber);
    }



}
