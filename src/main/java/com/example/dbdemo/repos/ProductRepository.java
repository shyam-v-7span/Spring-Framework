package com.example.dbdemo.repos;

import com.example.dbdemo.entities.Product;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;

public interface ProductRepository extends CrudRepository<Product,Integer> , PagingAndSortingRepository<Product,Integer> {
    //JPA query methods
    List<Product> findByName(String name);

    List<Product> findByPriceGreaterThan(Double price);
    List<Product> findByPriceBetween(Double price1,Double price2);

    List<Product> findByDescriptionContaining(String description);
    List<Product> findByDescriptionLike(String description);
}
