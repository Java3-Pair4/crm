package srs.customerservice.Services.DTOs.Response.BillingAccountResponse;

public class createdBillingAccountResponse {
    private String id;
    private String status;
    private String accountNumber;
    private String name;
    private String type;
    private String customerId;
    private String addressId;

    public createdBillingAccountResponse(String id, String status, String accountNumber, String name, String type, String customerId, String addressId) {
        this.id = id;
        this.status = status;
        this.accountNumber = accountNumber;
        this.name = name;
        this.type = type;
        this.customerId = customerId;
        this.addressId = addressId;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getAddressId() {
        return addressId;
    }

    public void setAddressId(String addressId) {
        this.addressId = addressId;
    }
}
