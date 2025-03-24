package com.mapping.Inheritancemapping;

import com.mapping.Inheritancemapping.tableperclass.entities.Cheque;
import com.mapping.Inheritancemapping.tableperclass.entities.CreditCard;
import com.mapping.Inheritancemapping.tableperclass.repos.PaymentRepo;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class TablePerClassTest {
    @Autowired
    PaymentRepo repository;

    @Test
    void contextLoads() {
    }

    @Test
    public void createPayment(){
        CreditCard creditCard = new CreditCard();
        creditCard.setId(1);
        creditCard.setCardNumber("1234567890");
        creditCard.setAmount(5000.0);
        repository.save(creditCard);

        Cheque cheque = new Cheque();
        cheque.setId(2);
        cheque.setChequeNumber("1254789652");
        cheque.setAmount(10000.0);
        repository.save(cheque);
    }
}
