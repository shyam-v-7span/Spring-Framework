package com.example.springDemo.Autowire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("autowireConfig.xml");

        BankAccount bankAccount = context.getBean(BankAccount.class);
        // call method of bankAccount
        bankAccount.deposit(10000);
        bankAccount.withdraw(5000);

        // call getters
        System.out.println(bankAccount.getAccountHolderName());
        System.out.println(bankAccount.getBalance());

    }
}
