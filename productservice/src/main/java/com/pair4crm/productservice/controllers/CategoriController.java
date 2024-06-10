package com.pair4crm.productservice.controllers;

import com.pair4crm.productservice.dtos.responses.getCategoriResponse;
import com.pair4crm.productservice.services.abstracts.CategoriService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/categoris")
public class CategoriController {

    private final CategoriService categoriService;


    public CategoriController(CategoriService categoriService) {
        this.categoriService = categoriService;
    }

   @GetMapping
    public List<getCategoriResponse> getAll() {
       return   categoriService.getAll();




    }








}
