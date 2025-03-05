package com.example.springDemo.beanLifeCycle.beanLifeCycleUsingAnnotations;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("beanLifeCycleByAnnotations.xml");
        //get bean
        Transaction transaction = (Transaction) context.getBean("transaction");

        transaction.processTransaction();

        // register shutdown hook
        context.registerShutdownHook();
    }
}
