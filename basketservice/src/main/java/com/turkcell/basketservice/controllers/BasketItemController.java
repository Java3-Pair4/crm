package com.turkcell.basketservice.controllers;

import com.turkcell.basketservice.service.abstracts.BasketItemService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/basketItem")
public class BasketItemController {

    private final BasketItemService basketItemService;


    public BasketItemController(BasketItemService basketItemService) {
        this.basketItemService = basketItemService;
    }
}
