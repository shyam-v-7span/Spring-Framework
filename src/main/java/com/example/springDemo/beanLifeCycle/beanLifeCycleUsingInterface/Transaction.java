package com.example.springDemo.beanLifeCycle.beanLifeCycleUsingInterface;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Transaction implements InitializingBean, DisposableBean {
    private int accountNumber;

    public Transaction(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    // init method
    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("init method called");
        System.out.println("Transaction started from account number: " + accountNumber);
    }

    public void processTransaction() {
        System.out.println("Processing transaction ");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("destroy method called");
        System.out.println("Transaction ended of account number: " + accountNumber);
    }



}
