package com.pair4crm.productservice.services.concretes;

import com.pair4crm.productservice.entities.Product;
import com.pair4crm.productservice.repositories.ProductRepository;
import com.pair4crm.productservice.services.abstracts.ProductServices;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImp implements ProductServices {
    private final ProductRepository productRepository;

    public ProductServiceImp(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public List<Product> getAllProducts() {

       // List<Product> products = productRepository.findAll();

        return productRepository.findAll();

    }

    @Override
    public Product getProductById(int id) {
        return productRepository.findById(id);
    }
}
