package com.pair4crm.productservice.clients;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "orderservice")
public interface OrderServiceClient {

	//Order ID
    //Order Items

    @GetMapping("/api/v1/products")   //get isteği at
    int getOrderId(@RequestParam int orderId);

    @GetMapping("/api/v1/products/items")   //get isteği at
    String getItems(@RequestParam String items);





}
