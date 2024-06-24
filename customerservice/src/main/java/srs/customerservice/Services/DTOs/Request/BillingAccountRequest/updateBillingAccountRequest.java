package srs.customerservice.Services.DTOs.Request.BillingAccountRequest;

import jakarta.validation.constraints.NotBlank;

public class updateBillingAccountRequest {

    @NotBlank
    private String name;

    @NotBlank
    private String description;

    @NotBlank
    private String accountNumber;

    @NotBlank
    private String type;

    private String addressId;

    public updateBillingAccountRequest(String name, String description, String accountNumber, String type, String addressId) {
        this.name = name;
        this.description = description;
        this.accountNumber = accountNumber;
        this.type = type;
        this.addressId = addressId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getAddressId() {
        return addressId;
    }

    public void setAddressId(String addressId) {
        this.addressId = addressId;
    }
}
