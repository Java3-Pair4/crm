package com.pair4crm.productservice.dtos.requests;

public class AddProdCharRequest {



    private String prodChar;

    public AddProdCharRequest() {
    }

    public AddProdCharRequest(String prodChar) {
        this.prodChar = prodChar;
    }


    public String getProdChar() {
        return prodChar;
    }

    public void setProdChar(String prodChar) {
        this.prodChar = prodChar;
    }
}
