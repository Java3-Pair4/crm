package srs.customerservice.Services.DTOs.Request.Address;

import jakarta.validation.constraints.NotBlank;

public class UpdateAddressRequest {



    @NotBlank(message = "City alanı boş bırakılamaz")
    private String city;
    @NotBlank(message = "District alanı boş bırakılamaz")
    private String district;
    @NotBlank(message = "Street alanı boş bırakılamaz")
    private String street;
    @NotBlank(message = "House Number alanı boş bırakılamaz")
    private String houseNumber;
    @NotBlank(message = "Description alanı boş bırakılamaz")
    private String description;

    public UpdateAddressRequest(String city, String district, String street, String houseNumber, String description) {
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

    public void setDescription(String description) {
        this.description = description;
    }
}
