package com.pair4crm.productservice.services.concretes;

import com.pair4crm.productservice.dtos.responses.ProductConfigurationResponse;
import com.pair4crm.productservice.entities.Product;
import com.pair4crm.productservice.repositories.ProductRepository;
import com.pair4crm.productservice.services.abstracts.ProductConfigurationService;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ProductConfigurationServiceImpl implements ProductConfigurationService {

    private final ProductRepository productRepository;

    public ProductConfigurationServiceImpl(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }




    /*

    Product Configuration” ekranında kullanıcının seçtiği ürünler liste şeklinde ve
     ürünlerin karakteristik bilgileri ile
    birlikte gösterilecektir. Ürünlerin Prod ID ve Prod Name bilgileri sistem tarafından ekrana yazdırılacaktır.
     */

    @Override
    public ProductConfigurationResponse getProductConfiguration(int Id) {

        Optional<Product> product = Optional.ofNullable(productRepository.findById(Id));

        //db de product bulundu ise product id, name, karakteristik bilgilerini geri dön.


        int productId = product.get().getId();
        String productName = product.get().getName();
        String productChar = product.get().getProdChar();

        return new ProductConfigurationResponse(productId, productName, productChar);

    }
}