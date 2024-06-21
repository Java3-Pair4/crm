package srs.customerservice.Services.DTOs.Response;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


public class AddCustomerResponse {
    private int id;
    private String customerId;
    private String nationalityId;
    private String accountNumber;
    private String gsmNumber;
    private String firstName;
    private String middleName;
    private String lastName;

    private String fatherName;
    private String motherName;
    private String gender;

    public AddCustomerResponse(int id, String customerId, String nationalityId, String accountNumber, String gsmNumber, String firstName, String middleName, String lastName, String fatherName, String motherName, String gender) {
        this.id = id;
        this.customerId = customerId;
        this.nationalityId = nationalityId;
        this.accountNumber = accountNumber;
        this.gsmNumber = gsmNumber;
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.fatherName = fatherName;
        this.motherName = motherName;
        this.gender = gender;
    }

    public AddCustomerResponse() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getNationalityId() {
        return nationalityId;
    }

    public void setNationalityId(String nationalityId) {
        this.nationalityId = nationalityId;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getGsmNumber() {
        return gsmNumber;
    }

    public void setGsmNumber(String gsmNumber) {
        this.gsmNumber = gsmNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFatherName() {
        return fatherName;
    }

    public void setFatherName(String fatherName) {
        this.fatherName = fatherName;
    }

    public String getMotherName() {
        return motherName;
    }

    public void setMotherName(String motherName) {
        this.motherName = motherName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
