package srs.customerservice.Services.DTOs.Request.Contact;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

public class UpdateContactRequest {


    @NotBlank(message = "E-mail boş bırakılamaz.")
    @Email(message = "Geçerli bir e-mail adresi giriniz.")
    private String email;

    @NotBlank(message = "Mobile phone boş bırakılamaz.")
    @Size(min = 11, max = 11, message = "Mobile phone 11 haneli olmalıdır.")
    @Pattern(regexp = "\\d+", message = "Mobile phone pozitif tam sayı olmalıdır.")
    private String mobilePhone;

    @Size(min = 11, max = 11, message = "Home phone 11 haneli olmalıdır.")
    @Pattern(regexp = "\\d*", message = "Home phone pozitif tam sayı olmalıdır.")
    private String homePhone;

    @Size(min = 12, max = 12, message = "Fax 12 haneli olmalıdır.")
    @Pattern(regexp = "\\d{2}-\\d{3}-\\d{7}", message = "Fax numarası 44-112-7859642 formatında olmalıdır.")
    private String fax;

    public UpdateContactRequest(String email, String mobilePhone, String homePhone, String fax) {
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
