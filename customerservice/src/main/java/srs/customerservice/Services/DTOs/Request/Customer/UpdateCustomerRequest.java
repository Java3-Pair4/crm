package srs.customerservice.Services.DTOs.Request.Customer;

import jakarta.validation.constraints.*;

import java.time.LocalDate;

public class UpdateCustomerRequest {
    @NotBlank(message = "First Name boş bırakılamaz")
    @Size(max = 50, message = "First Name max 50 karakter olmalıdır.")
    @Pattern(regexp = "^(?!\\d+$)[\\p{L}0-9]+$", message = "First Name sayı ve harfler birlikte kullanılabilir, sadece sayı ve özel karakter kullanılamaz ")
    private String firstName;

    @Size(max = 50, message = "Middle Name max 50 karakter olmalıdır.")
    @Pattern(regexp = "^(?!\\d+$)[\\p{L}0-9]*$", message = "Middle Name sayı ve harfler birlikte kullanılabilir,sadece sayı ve özel karakter kullanılamaz.")
    private String middleName;

    @NotBlank(message = "Last Name boş bırakılamaz ")
    @Size(max = 50, message = "Last Name  max 50 karakter olmalıdır.")
    @Pattern(regexp = "^(?!\\d+$)[\\p{L}0-9]+$", message = "Last Name sayı ve harfler birlikte kullanılabilir,sadece sayı ve özel karakter kullanılamaz.")
    private String lastName;

    @Size(max = 50, message = "Mother Name  max 50 karakter olmalıdır.")
    @Pattern(regexp = "^(?!\\d+$)[\\p{L}0-9]*$", message = "Mother Name sayı ve harfler birlikte kullanılabilir, sadece sayı ve özel karakter kullanılamaz.")
    private String motherName;

    @Size(max = 50, message = "Father Name max 50 karakter olmalıdır.")
    @Pattern(regexp = "^(?!\\d+$)[\\p{L}0-9]*$", message = "Father Name sayı ve harfler birlikte kullanılabilir, sadece sayı ve özel karakter kullanılamaz.")
    private String fatherName;

    @NotBlank(message = "Gender boş bırakılamaz.")
    @Pattern(regexp = "Female|Male")
    private String gender;

    @NotNull(message = "Birth Date boş bırakılamaz.")
    @PastOrPresent(message = "Birth Date içinde bulunulan yıldan büyük bir değer girilememelidir. ")
    private LocalDate birthDate;

    @NotNull(message = " nationalityID boş bırakılamaz.")
    @Pattern(regexp = "\\d{11}", message = "Nationality ID 11 haneli olmalıdır.")
    private String nationalityID;

    public UpdateCustomerRequest(String firstName, String middleName, String lastName, String motherName, String fatherName, String gender, LocalDate birthDate, String nationalityID) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.motherName = motherName;
        this.fatherName = fatherName;
        this.gender = gender;
        this.birthDate = birthDate;
        this.nationalityID = nationalityID;
    }

    public String getNationalityID() {
        return nationalityID;
    }

    public void setNationalityID(String nationalityID) {
        this.nationalityID = nationalityID;
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

    public @NotNull(message = "Birth Date boş bırakılamaz.") @PastOrPresent(message = "Birth Date içinde bulunulan yıldan büyük bir değer girilememelidir. ") LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }
}
