package com.example.SpringRest.entities;

public class AccoutHolder {
    private String name;
    private long accountNumber;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public AccoutHolder(String name, long accountNumber) {
        this.name = name;
        this.accountNumber = accountNumber;
    }
}
