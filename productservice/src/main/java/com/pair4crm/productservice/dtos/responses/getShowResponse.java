package com.pair4crm.productservice.dtos.responses;

import java.util.ArrayList;
import java.util.List;

public class getShowResponse {



    private String prodChar;
    private List<String> addresses = new ArrayList<>();

    public getShowResponse(String prodChar, List<String> addresses) {
        this.prodChar = prodChar;
        this.addresses = addresses;
    }

    public String getProdChar() {
        return prodChar;
    }

    public void setProdChar(String prodChar) {
        this.prodChar = prodChar;
    }

    public List<String> getAddresses() {
        return addresses;
    }

    public void setAddresses(List<String> addresses) {
        this.addresses = addresses;
    }
}
