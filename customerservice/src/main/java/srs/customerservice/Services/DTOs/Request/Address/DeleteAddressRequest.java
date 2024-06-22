package srs.customerservice.Services.DTOs.Request.Address;

import jakarta.validation.constraints.NotBlank;
import srs.customerservice.Entities.Address;

import java.util.List;

public class DeleteAddressRequest {

    private int customerId;
    private List<Address> addresses;

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



    public DeleteAddressRequest(int customerId, List<Address> addresses, String district, String city, String street, String houseNumber, String description) {
        this.customerId = customerId;
        this.addresses = addresses;
        this.district = district;
        this.city = city;
        this.street = street;
        this.houseNumber = houseNumber;
        this.description = description;
    }

    public DeleteAddressRequest() {
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public List<Address> getAddresses() {
        return addresses;
    }

    public void setAddresses(List<Address> addresses) {
        this.addresses = addresses;
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
