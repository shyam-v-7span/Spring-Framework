package com.mapping.Inheritancemapping;

//import com.mapping.Inheritancemapping.singletable.entities.CreditCard;
//import com.mapping.Inheritancemapping.singletable.entities.UpiPayment;
//import com.mapping.Inheritancemapping.singletable.repos.PaymentRepository;
import com.mapping.Inheritancemapping.singletable.entities.CreditCard;
import com.mapping.Inheritancemapping.singletable.entities.UpiPayment;
import com.mapping.Inheritancemapping.singletable.repos.PaymentRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class InheritancemappingApplicationTests {

	@Autowired
    PaymentRepository repository;

	@Test
	void contextLoads() {
	}

	@Test
	public void createPayment(){
		CreditCard creditCard = new CreditCard();
		creditCard.setCardNumber("1234567890");
		creditCard.setAmount(5000.0);
		repository.save(creditCard);

		UpiPayment upiPayment = new UpiPayment();
		upiPayment.setUpiId("Shyam@bob");
		upiPayment.setAmount(50000.0);
		repository.save(upiPayment);
	}
}
