package com.pair4crm.productservice.dtos.responses;

import java.util.List;

public class getSubmitDetayResponse {


    private int id;
    private String items;
    private List<String> address;

    public getSubmitDetayResponse(int id, String items, List<String> address) {
        this.id = id;
        this.items = items;
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getItems() {
        return items;
    }

    public void setItems(String items) {
        this.items = items;
    }

    public List<String> getAddress() {
        return address;
    }

    public void setAddress(List<String> address) {
        this.address = address;
    }
}
