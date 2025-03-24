package com.School.entities;

import jakarta.persistence.*;

@Entity
public class Icard {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "card_id")
    private int cardId;
    @Column(name = "expire_date")
    private String expireDate;

    @OneToOne
    @JoinColumn(name = "student_id", unique = true) // Foreign Key in Icard Table
    private Student student;

    // Getters and Setters
    public int getCardId() { return cardId; }
    public void setCardId(int cardId) { this.cardId = cardId; }

    public String getExpireDate() { return expireDate; }
    public void setExpireDate(String expireDate) { this.expireDate = expireDate; }

    public Student getStudent() { return student; }
    public void setStudent(Student student) { this.student = student; }
}
