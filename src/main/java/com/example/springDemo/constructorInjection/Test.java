package com.example.springDemo.constructorInjection;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class Test {
    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(Test.class,args);

        BankAccount bankAccount = context.getBean("bankAccount", BankAccount.class);
        // call method of bankAccount
        bankAccount.deposit(10000);
        bankAccount.withdraw(1000);
    }
}
