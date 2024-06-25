package com.pair4crm.productservice.repositories;

import com.pair4crm.productservice.entities.Catalog;
import com.pair4crm.productservice.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Product,Integer> {
    List<Product> findAll();

    Product findById(int prodId);

    List<Product> findByCatalog(Catalog catalog);
    List<Product> findByProductId(String productId);
    List<Product> findByNameContaining(String name);
    List<Product> findByProductIdAndNameContaining(String productId, String name);


}
