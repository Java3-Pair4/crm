package com.pair4crm.productservice.dtos.responses;

import jakarta.persistence.Column;

import java.sql.Date;

public class ProductConfigurationResponse {

    private int id;
    private String name;
    private String prodChar;
    private String adress;
    private Date startDate;

    public ProductConfigurationResponse(int id, String name, String prodChar, String adress, Date startDate) {
        this.id = id;
        this.name = name;
        this.prodChar = prodChar;
        this.adress = adress;
        this.startDate = startDate;
    }

    public ProductConfigurationResponse(int id, String name, String prodChar) {
        this.id = id;
        this.name = name;
        this.prodChar = prodChar;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
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
