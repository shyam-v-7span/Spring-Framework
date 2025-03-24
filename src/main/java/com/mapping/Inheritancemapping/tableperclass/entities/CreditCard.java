package com.mapping.Inheritancemapping.tableperclass.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;

@Entity
public class CreditCard extends Payment {

    @Column(name = "cardNumber")
    private String cardNumber;

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }
}
