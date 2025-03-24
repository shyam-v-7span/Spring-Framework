package com.mapping.Inheritancemapping.joined.entities;

import jakarta.persistence.Entity;

@Entity
public class Cheque extends Payment {

    private String chequeNumber;

    public String getChequeNumber() {
        return chequeNumber;
    }

    public void setChequeNumber(String chequeNumber) {
        this.chequeNumber = chequeNumber;
    }
}
