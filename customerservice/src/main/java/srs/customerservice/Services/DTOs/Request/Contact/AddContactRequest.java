package srs.customerservice.Services.DTOs.Request.Contact;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Positive;

public class AddContactRequest {


    @NotBlank(message = "E-mail alanı boş bırakılamaz")
    @Pattern(regexp = "^[A-Za-z0-9+_.-]+@(.+)$", message = "Geçersiz e-mail formatı")
    private String email;

    @NotBlank(message = "Mobile Phone alanı boş bırakılamaz")
    @Pattern(regexp = "^\\d{11}$", message = "Mobile Phone 11 haneli olmalıdır")
    @Positive(message = "Mobile Phone pozitif bir tam sayı olmalıdır")
    private String mobilePhone;

    @Pattern(regexp = "^\\d{11}$", message = "Home Phone 11 haneli olmalıdır")
    @Positive(message = "Home Phone pozitif bir tam sayı olmalıdır")
    private String homePhone;

    @Pattern(regexp = "^\\d{2}-\\d{3}-\\d{7}$", message = "Fax 12 haneli olmalı ve ülke kodu-alan kodu-fax numarası formatında olmalıdır. Örneğin; 44-112-7859642")
    private String fax;

    public AddContactRequest(String email, String mobilePhone, String homePhone, String fax) {
        this.email = email;
        this.mobilePhone = mobilePhone;
        this.homePhone = homePhone;
        this.fax = fax;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobilePhone() {
        return mobilePhone;
    }

    public void setMobilePhone(String mobilePhone) {
        this.mobilePhone = mobilePhone;
    }

    public String getHomePhone() {
        return homePhone;
    }

    public void setHomePhone(String homePhone) {
        this.homePhone = homePhone;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }
}
