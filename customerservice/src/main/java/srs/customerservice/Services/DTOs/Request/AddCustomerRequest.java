package srs.customerservice.Services.DTOs.Request;

import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;
import srs.customerservice.Entities.Address;
import srs.customerservice.Entities.Contact;

import java.time.LocalDate;
import java.util.List;


public class AddCustomerRequest {



    @Size(min=7, max=7)
    private String customerID;

    @NotEmpty(message = "Nationality ID cannot be empty")
    @Pattern(regexp = "\\d{11}")
    private String nationalityID;
    @Pattern(regexp = "[0-9\\s]{8}")
    private String accountNumber;

    @Pattern(regexp = "[0-9\\d{12}]")
    private String gsmNumber;

    @NotEmpty(message = "This field is required")
    @Size(max = 50)
    private String firstName;

    @NotEmpty(message = "This field is required")
    @Size(max = 50)
    private String lastName;

    @Size(max = 50)
    private String middleName;
    @Size(max = 50)
    private String motherName;
    @Size(max = 50)
    private String fatherName;
    @NotEmpty(message = "This field is required")
    private String gender;

    @NotNull(message = "This field is required")
    @DateTimeFormat(pattern = "dd-MM-yyyy")
    private LocalDate birthDate;


    @OneToMany
    @JoinColumn(name = "address_id")
    private List<Address> addresses;

    @OneToOne
    @JoinColumn(name = "contact_id")
    private Contact contact;

    public AddCustomerRequest(String customerID, String nationalityID, String accountNumber, String gsmNumber, String firstName, String lastName, String middleName, String motherName, String fatherName, String gender, LocalDate birthDate, List<Address> addresses, Contact contact) {
        this.customerID = customerID;
        this.nationalityID = nationalityID;
        this.accountNumber = accountNumber;
        this.gsmNumber = gsmNumber;
        this.firstName = firstName;
        this.lastName = lastName;
        this.middleName = middleName;
        this.motherName = motherName;
        this.fatherName = fatherName;
        this.gender = gender;
        this.birthDate = birthDate;
        this.addresses = addresses;
        this.contact = contact;
    }

    public String getCustomerID() {
        return customerID;
    }

    public void setCustomerID(String customerID) {
        this.customerID = customerID;
    }

    public String getNationalityID() {
        return nationalityID;
    }

    public void setNationalityID(String nationalityID) {
        this.nationalityID = nationalityID;
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

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getMotherName() {
        return motherName;
    }

    public void setMotherName(String motherName) {
        this.motherName = motherName;
    }

    public String getFatherName() {
        return fatherName;
    }

    public void setFatherName(String fatherName) {
        this.fatherName = fatherName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public List<Address> getAddresses() {
        return addresses;
    }

    public void setAddresses(List<Address> addresses) {
        this.addresses = addresses;
    }

    public Contact getContact() {
        return contact;
    }

    public void setContact(Contact contact) {
        this.contact = contact;
    }


}
