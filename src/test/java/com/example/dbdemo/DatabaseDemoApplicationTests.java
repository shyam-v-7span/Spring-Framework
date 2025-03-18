package com.example.dbdemo;

import com.example.dbdemo.entities.Product;
import com.example.dbdemo.repos.ProductRepository;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@RunWith(SpringRunner.class)
@SpringBootTest
class DatabaseDemoApplicationTests {

	@Autowired
	ProductRepository repository;

	@Test
	void contextLoads() {
	}

	// create Product
	@Test
	public void testCreate(){
		Product product = new Product();
		product.setName("Iphone 15 pro max");
		product.setDescription("it is a nice and powerful phone");
		product.setPrice(100000d);

		repository.save(product);
	}

	// Read Product by id
	@Test
	public void testRead(){

		Optional<Product> optionalProduct = repository.findById(1);

		if (optionalProduct.isPresent()){
			System.out.println("Product Found: " + optionalProduct.get());
		}
		else {
			System.out.println("Product not found");
		}
	}

	// update method
	@Test
	public void testUpdate(){
		Product product = repository.findById(1).get();
		product.setPrice(150000);
		repository.save(product);
	}

	// delete method
	@Test
	public void testDelete(){
		if(repository.existsById(1)){
			repository.deleteById(1);
		}
		else {
			System.out.println("data is not found");
		}
	}

	//method for give count
	@Test
	public void testCount(){
		System.out.println(repository.count());
	}

	// find by name
	@Test
	public void findByName(){
		List<Product> products = repository.findByName("Realme 14 pro");
		products.forEach(product -> System.out.println(product.getDescription()));
	}

	// filter by price greater than
	@Test
	public void findByPriceGreaterThan(){
		List<Product> products = repository.findByPriceGreaterThan(25000d);
		products.forEach(product -> System.out.println(product.getName()));
	}

	@Test
	// give records if contain specific word in description
	public void findByDescriptionContaining(){
		List<Product> products = repository.findByDescriptionContaining("nice");
		products.forEach(product -> System.out.println(product.getName()));
	}

	@Test
	// products between price range
	public void findByPriceBetween(){
		List<Product> products = repository.findByPriceBetween(25001d , 200000d);
		products.forEach(product -> System.out.println(product.getName()));
	}

	// give matching records by using like
	@Test
	public void findByDescriptionLike(){
		List<Product> products = repository.findByDescriptionLike("%nice%");
		products.forEach(product -> System.out.println(product.getName()));
	}

	// method for paging
	@Test
	public void findAllPaging(){
		Pageable pageable = PageRequest.of(0,3);
		Page<Product> products = repository.findAll(pageable);
		products.forEach(product -> System.out.println(product.getName()));
	}

	// method for sorting
	@Test
	public void findAllSorting(){
		repository.findAll(Sort.by(Sort.Direction.DESC,"price","name")).forEach(product -> System.out.println(product.getName()));
	}
}
