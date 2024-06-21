package com.pair4crm.productservice.controllers;

import com.pair4crm.productservice.clients.OrderServiceClient;
import com.pair4crm.productservice.dtos.requests.AddProdCharAndAddressRequest;
import com.pair4crm.productservice.dtos.requests.AddProdCharRequest;
import com.pair4crm.productservice.dtos.requests.AddServiceAddressRequest;
import com.pair4crm.productservice.dtos.responses.ProductConfigurationResponse;
import com.pair4crm.productservice.dtos.responses.getShowResponse;
import com.pair4crm.productservice.dtos.responses.getSubmitDetayResponse;
import com.pair4crm.productservice.services.abstracts.ProductConfigurationService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/ProductConfigurationSayfası")
public class ProductConfigurationSayfasıController {

    ProductConfigurationService productConfigurationService;
    private final OrderServiceClient orderServiceClient;

    public ProductConfigurationSayfasıController(ProductConfigurationService productConfigurationService, OrderServiceClient orderServiceClient) {
        this.productConfigurationService = productConfigurationService;
        this.orderServiceClient = orderServiceClient;
    }



    @GetMapping("/{id}")
    public ProductConfigurationResponse getProductConfiguration(@PathVariable int id){

       return productConfigurationService.getProductConfiguration(id);


    }

    @PostMapping("/{id}/prodchar")
    public ProductConfigurationResponse addProdChar(@PathVariable int id, @RequestBody AddProdCharRequest request) {
        return productConfigurationService.addProdChar(id, request);
    }


    @PostMapping("/{id}/address")
    public ProductConfigurationResponse addAddress(@PathVariable int id, @RequestBody AddServiceAddressRequest request){

        return productConfigurationService.addServiceAddress(id, request);


    }

    @GetMapping("/{id}/getAdres")
    public List<String> getAddress(@PathVariable int id){

        return productConfigurationService.getServiceAddress(id);
    }

    @PostMapping("/{id}/prodCharAndAddress")
    void addProdCharAndAddress(@PathVariable int id, @RequestBody AddProdCharAndAddressRequest request){
        productConfigurationService.AddProdCharAndAddress(id, request);

    }

    @GetMapping("/getSubmitDetay/{id}")
    public getSubmitDetayResponse getSubmitDetal(@PathVariable int id) {

        return productConfigurationService.getSubmitDetal(id);
    }














    @GetMapping
    public getShowResponse getShow(int id) {

        return productConfigurationService.getShow(id);
    }


















}
