package com.pair4crm.productservice.services.concretes;

import com.pair4crm.productservice.entities.Product;
import com.pair4crm.productservice.repositories.ProductRepository;
import com.pair4crm.productservice.services.abstracts.ProductServices;
import com.pair4crm.productservice.services.mappers.ProductMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ProductServiceImp implements ProductServices {
    private final ProductRepository productRepository;

    public ProductServiceImp(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public List<Product> getAllProducts() {
        List<Product> products=productRepository.findAll();
        return products.stream()
                .map(ProductMapper.INSTANCE::productToListProductResponse)
                          .collect(Collectors.toList());

    }
}
