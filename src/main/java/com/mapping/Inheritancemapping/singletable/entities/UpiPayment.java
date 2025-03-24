package com.mapping.Inheritancemapping.singletable.entities;

import jakarta.persistence.Column;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
@DiscriminatorValue("UPI")
public class UpiPayment extends Payment{
    @Column(name = "UpiId")
    private String UpiId;

    public String getUpiId() {
        return UpiId;
    }

    public void setUpiId(String upiId) {
        UpiId = upiId;
    }
}
