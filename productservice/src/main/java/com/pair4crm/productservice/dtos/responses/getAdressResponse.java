package com.pair4crm.productservice.dtos.responses;

public class getAdressResponse {

    private String adress;

    public getAdressResponse(String adress) {
        this.adress = adress;
    }

    public getAdressResponse() {
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }
}
