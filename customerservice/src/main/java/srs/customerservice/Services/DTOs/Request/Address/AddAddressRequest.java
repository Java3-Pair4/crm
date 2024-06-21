package srs.customerservice.Services.DTOs.Request.Address;

import jakarta.validation.constraints.NotEmpty;
import srs.customerservice.Entities.Address;

import java.util.List;

public class AddAddressRequest {


    @NotEmpty(message = "City boş olamaz")
    private String city;

    @NotEmpty(message = "District alanı boş olamaz")
    private String district;

    @NotEmpty(message = "Street alanı boş olamaz")
    private String street;


    @NotEmpty(message = "House Number alanı boş olamaz")
    private String houseNumber;


    @NotEmpty(message = "Description alanı boş olamaz")
    private String description;

    public AddAddressRequest(int customerId, String city, String district, String street, String houseNumber, String description) {

        this.city = city;
        this.district = district;
        this.street = street;
        this.houseNumber = houseNumber;
        this.description = description;
    }




    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getHouseNumber() {
        return houseNumber;
    }

    public void setHouseNumber(String houseNumber) {
        this.houseNumber = houseNumber;
    }

    public String getDescription() {
        return description;
    }


}
