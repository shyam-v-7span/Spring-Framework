package com.jpql;

import com.jpql.entities.Product;
import com.jpql.repos.ProductsRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Arrays;
import java.util.List;

@SpringBootTest
class JpqlApplicationTests {

	@Test
	void contextLoads() {
	}

	@Autowired
	ProductsRepository repository;

	@Test
	public void findAllProducts(){
		List<Product> products = repository.findAllProducts();
		products.forEach(product -> System.out.println(product));
	}

	@Test
	public void findOnlyProductNameAndPrice(){
		List<Object[]> products = repository.findPartialData();
		products.forEach(objects -> System.out.println(Arrays.toString(objects)));
	}

	@Test
	public void filterByprice(){
		List<Product> products = repository.filterByprice(20000, 51000);
		products.forEach(product -> System.out.println(product));
	}

	@Test
	public void findAllProductsNativeQuery(){
		List<Product> products = repository.findAllProductsNativeQuery();
		products.forEach(product -> System.out.println(product));
	}

	@Test
	public void findProductsByNameNativeQuery(){
		List<Product> products = repository.findProductsByNameNativeQuery("TV");
		products.forEach(product -> System.out.println(product));
	}
}
