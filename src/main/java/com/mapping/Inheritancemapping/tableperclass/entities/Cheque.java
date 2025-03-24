package com.mapping.Inheritancemapping.tableperclass.entities;

import jakarta.persistence.Column;
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
