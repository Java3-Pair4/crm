package com.pair4crm.productservice.dtos.requests;

public class AddServiceAddressRequest {


    private String adress;

    public AddServiceAddressRequest(String adress) {
        this.adress = adress;
    }

    public AddServiceAddressRequest() {
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }
}
