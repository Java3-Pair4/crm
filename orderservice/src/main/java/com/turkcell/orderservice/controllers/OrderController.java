package com.turkcell.orderservice.controllers;

import com.turkcell.orderservice.services.Abstracts.OrderService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api/v1/Order")
public class OrderController {

    private final OrderService orderService;

    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    @GetMapping("/api/v1/order")   //get isteği at
    int getOrderId(@RequestParam int orderId){


     return orderService.getOrderId(orderId);
    }

    @GetMapping("/api/v1/products/items")   //get isteği at
    String getItems(@RequestParam String items){

        return "";
    }




}
