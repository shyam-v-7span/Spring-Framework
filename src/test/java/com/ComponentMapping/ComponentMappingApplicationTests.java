package com.ComponentMapping;

import com.ComponentMapping.entities.Address;
import com.ComponentMapping.entities.Person;
import com.ComponentMapping.repository.PersonRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ComponentMappingApplicationTests {

	@Autowired
	PersonRepository repository;

	@Test
	void contextLoads() {
	}

	@Test
	public void testCreate(){
		Address address = new Address();
		address.setCity("Rajkot");
		address.setState("Gujarat");

		// Create person
		Person person = new Person();
		person.setName("Shyam");
		person.setAddress(address);

		repository.save(person);
	}
}
