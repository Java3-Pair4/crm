package srs.customerservice.Services.DTOs.Request.Customer;

import jakarta.validation.constraints.*;

public class AddCustomerDemografikRequest {


    @NotEmpty(message = "First Name boş bırakılamaz.")
    @Size(max = 50, message = "First Name 50 karakteri geçmemelidir.")
    @Pattern(regexp = "^[a-zA-Z0-9\\s]*$", message = "First Name yalnızca harf ve rakam içerebilir.")
    private String firstName;

    @Size(max = 50, message = "Middle Name 50 karakteri geçmemelidir.")
    @Pattern(regexp = "^[a-zA-Z0-9\\s]*$", message = "Middle Name yalnızca harf ve rakam içerebilir.")
    private String middleName;

    @NotEmpty(message = "Last Name boş bırakılamaz.")
    @Size(max = 50, message = "Last Name 50 karakteri geçmemelidir.")
    @Pattern(regexp = "^[a-zA-Z0-9\\s]*$", message = "Last Name yalnızca harf ve rakam içerebilir.")
    private String lastName;

    @NotNull(message = "Birth Date boş bırakılamaz.")
    @Pattern(regexp = "^(0[1-9]|[12][0-9]|3[01])/(0[1-9]|1[0-2])/([0-9]{4})$", message = "Geçerli bir doğum tarihi giriniz (Gün/Ay/Yıl).")
    private String birthDate;

    @NotNull(message = "Gender boş bırakılamaz.")
    @Pattern(regexp = "^(Male|Female)$", message = "Geçerli bir cinsiyet seçiniz.")
    private String gender;

    @Size(max = 50, message = "Mother Name 50 karakteri geçmemelidir.")
    @Pattern(regexp = "^[a-zA-Z0-9\\s]*$", message = "Mother Name yalnızca harf ve rakam içerebilir.")
    private String motherName;

    @Size(max = 50, message = "Father Name 50 karakteri geçmemelidir.")
    @Pattern(regexp = "^[a-zA-Z0-9\\s]*$", message = "Father Name yalnızca harf ve rakam içerebilir.")
    private String fatherName;

    @NotNull(message = "Nationality ID boş bırakılamaz.")
    @Pattern(regexp = "^[1-9][0-9]{10}$", message = "Nationality ID 11 haneli pozitif tam sayı olmalıdır.")
    private String nationalityId;

    public AddCustomerDemografikRequest() {
    }

    public AddCustomerDemografikRequest(String firstName, String middleName, String lastName, String birthDate, String gender, String motherName, String fatherName, String nationalityId) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.gender = gender;
        this.motherName = motherName;
        this.fatherName = fatherName;
        this.nationalityId = nationalityId;
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

    public @NotNull(message = "Birth Date boş bırakılamaz.") @Pattern(regexp = "^(0[1-9]|[12][0-9]|3[01])/(0[1-9]|1[0-2])/([0-9]{4})$", message = "Geçerli bir doğum tarihi giriniz (Gün/Ay/Yıl).") String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
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

    public @NotNull(message = "Nationality ID boş bırakılamaz.") @Pattern(regexp = "^[1-9][0-9]{10}$", message = "Nationality ID 11 haneli pozitif tam sayı olmalıdır.") String getNationalityId() {
        return nationalityId;
    }

    public void setNationalityId(String nationalityId) {
        this.nationalityId = nationalityId;
    }
}
