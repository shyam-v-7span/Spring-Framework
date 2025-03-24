package com.Transaction;

import com.Transaction.services.BankAccountService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class TransactionApplicationTests {

	@Autowired
	BankAccountService bankAccountService;
	@Test
	void contextLoads() {
	}

	@Test
	public void transfer(){
		bankAccountService.transfer(1000);
	}
}
