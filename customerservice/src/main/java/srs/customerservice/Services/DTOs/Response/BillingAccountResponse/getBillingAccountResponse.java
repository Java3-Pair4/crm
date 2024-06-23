package srs.customerservice.Services.DTOs.Response.BillingAccountResponse;




public class getBillingAccountResponse {



    private int id;
    private boolean status;
    private String accountNumber;
    private String name;
    private String type;

    public getBillingAccountResponse(int id, boolean status, String accountNumber, String name, String type) {
        this.id = id;
        this.status = status;
        this.accountNumber = accountNumber;
        this.name = name;
        this.type = type;
    }

    public getBillingAccountResponse() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
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
}
