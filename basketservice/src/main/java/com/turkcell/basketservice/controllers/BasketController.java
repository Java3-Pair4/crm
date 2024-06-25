package com.turkcell.basketservice.controllers;

import com.turkcell.basketservice.service.abstracts.BasketService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/basket")
public class BasketController {

    private final BasketService basketService;

    public BasketController(BasketService basketService) {
        this.basketService = basketService;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void add(@RequestParam String customerId, @RequestParam int productId){
        basketService.add(customerId, productId);
    }

}
