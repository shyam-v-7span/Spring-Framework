package com.example.springDemo.constructorInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("constructorInjectionConfig.xml");

        BankAccount bankAccount = (BankAccount) context.getBean("bankAccount");
        // call method of bankAccount
        bankAccount.deposit(10000);
        bankAccount.withdraw(500000);
    }
}
