package com.example.springDemo.Autowire;

import org.springframework.stereotype.Component;

@Component
public class TransactionMessage {
    public void depositMessage(String accountHolderName, Double amount){
        System.out.println(amount + " is credited in " +accountHolderName+"'s account");
    }

    public void withdrawalMessage(String accountHolderName, Double amount){
        System.out.println(amount + " is debited from " +accountHolderName+"'s account");
    }
}
