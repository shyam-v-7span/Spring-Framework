package com.example.springDemo.Autowire;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class Test {
    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(Test.class,args);

        BankAccount bankAccount = context.getBean(BankAccount.class);

        bankAccount.setAccountHolderName("Shyam");
        bankAccount.setBalance(5000.0);
        // call method of bankAccount
        bankAccount.deposit(10000);
        bankAccount.withdraw(5000);

        // call getters
        System.out.println(bankAccount.getAccountHolderName());
        System.out.println(bankAccount.getBalance());

    }
}
