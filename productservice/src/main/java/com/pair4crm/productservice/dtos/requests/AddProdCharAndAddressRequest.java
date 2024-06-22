package com.pair4crm.productservice.dtos.requests;

import java.util.ArrayList;
import java.util.List;

public class AddProdCharAndAddressRequest {


    private List<String> addresses = new ArrayList<>();
    private String prodChar;

    public AddProdCharAndAddressRequest(List<String> addresses, String prodChar) {
        this.addresses = addresses;
        this.prodChar = prodChar;
    }

    public List<String> getAddresses() {
        return addresses;
    }

    public void setAddresses(List<String> addresses) {
        this.addresses = addresses;
    }

    public String getProdChar() {
        return prodChar;
    }

    public void setProdChar(String prodChar) {
        this.prodChar = prodChar;
    }
}
