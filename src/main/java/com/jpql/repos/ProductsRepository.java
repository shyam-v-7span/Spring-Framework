package com.jpql.repos;

import com.jpql.entities.Product;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ProductsRepository extends CrudRepository<Product,Integer> , PagingAndSortingRepository<Product,Integer> {
    @Query("from Product")
    List<Product> findAllProducts();

    @Query("select name , price from Product")
    List<Object[]> findPartialData();

    @Query("from Product where price>:min and price<:max")
    List<Product> filterByprice(@Param("min") int min , @Param("max") int max);

    // native query for retrive all data
    @Query(value = "select * from product",nativeQuery = true)
    List<Product> findAllProductsNativeQuery();

    @Query(value = "select * from product where name=:name",nativeQuery = true)
    List<Product> findProductsByNameNativeQuery(@Param("name") String name);
}
