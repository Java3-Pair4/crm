package com.pair4crm.productservice.controllers;


import com.pair4crm.productservice.dtos.responses.ListProductResponse;
import com.pair4crm.productservice.entities.Product;
import com.pair4crm.productservice.services.abstracts.ProductServices;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/products")
public class ProductsController {

    private final ProductServices productServices;

    public ProductsController(ProductServices productServices) {
        this.productServices = productServices;
    }

    @GetMapping
    public List<Product> getAllProducts() {
        return productServices.getAllProducts();
    }

}
