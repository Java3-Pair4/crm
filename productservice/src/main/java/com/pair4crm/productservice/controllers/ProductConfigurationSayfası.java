package com.pair4crm.productservice.controllers;

import com.pair4crm.productservice.dtos.responses.ProductConfigurationResponse;
import com.pair4crm.productservice.services.abstracts.ProductConfigurationService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/ProductConfigurationSayfası")
public class ProductConfigurationSayfası {

    ProductConfigurationService productConfigurationService;

    public ProductConfigurationSayfası(ProductConfigurationService productConfigurationService) {
        this.productConfigurationService = productConfigurationService;
    }



    @GetMapping("/{id}")
    public ProductConfigurationResponse getProductConfiguration(@PathVariable int id){

       return productConfigurationService.getProductConfiguration(id);


    }





}
