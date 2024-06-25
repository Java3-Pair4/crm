package com.pair4crm.productservice.services.concretes;

import com.pair4crm.productservice.entities.Catalog;
import com.pair4crm.productservice.entities.Product;
import com.pair4crm.productservice.repositories.CatalogRepository;
import com.pair4crm.productservice.repositories.ProductRepository;
import com.pair4crm.productservice.services.abstracts.ProductServices;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductServiceImp implements ProductServices {
    private final ProductRepository productRepository;

    private final CatalogRepository catalogRepository;

    public ProductServiceImp(ProductRepository productRepository, CatalogRepository catalogRepository) {
        this.productRepository = productRepository;
        this.catalogRepository = catalogRepository;
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

/*
    public List<Product> searchProducts(Long catalogId, int productId, String productName) {
        if (catalogId != null) {
            Catalog catalog = catalogRepository.findById(catalogId).orElse(null);
            if (catalog != null) {
                return productRepository.findByCatalog(catalog);
            }
        }

        if (productId != null && productName != null) {
            return productRepository.findByProductIdAndNameContaining(productId.toString(), productName);
        } else if (productId != null) {
            return productRepository.findByProductId(productId.toString());
        } else if (productName != null) {
            return productRepository.findByNameContaining(productName);
        } else {
            return new ArrayList<>();
        }
    }


 */









}
