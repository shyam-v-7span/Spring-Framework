package com.example.springDemo.constructorInjection;

public class TransactionMessage {
    public void depositMessage(String accountHolderName, Double amount){
        System.out.println(amount + " is credited in " +accountHolderName+"'s account");
    }

    public void withdrawalMessage(String accountHolderName, Double amount){
        System.out.println(amount + " is debited from " +accountHolderName+"'s account");
    }
}
