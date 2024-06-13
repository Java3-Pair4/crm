package com.pair4crm.productservice.dtos.responses;

public class ProductConfigurationResponse {

    private int id;
    private String name;
    private String prodChar;

    public ProductConfigurationResponse(int id, String name, String prodChar) {
        this.id = id;
        this.name = name;
        this.prodChar = prodChar;
    }

    public ProductConfigurationResponse() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProdChar() {
        return prodChar;
    }

    public void setProdChar(String prodChar) {
        this.prodChar = prodChar;
    }
}
