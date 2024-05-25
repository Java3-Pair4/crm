package com.pair4crm.productservice.dtos.requests;

import jakarta.validation.constraints.NotBlank;

public class AddProductRequest {
    @NotBlank(message = "Ürün ismi bos bırakılamaz.")
    private String name;


}
