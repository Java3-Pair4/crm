package srs.customerservice.Services.DTOs.Request;

import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class AddCustomerRequest {

    @NotBlank
    @Digits(integer = 11, fraction = 0)
    @Positive
    private int nationalityID;
    @Positive
    private int accountNumber;
    @NotBlank(message = "This field is required")
    @Size(max = 50)
    private String firstName;
    @NotBlank(message = "This field is required")
    @Size(max = 50)
    private String lastName;
    @Size(max = 50)
    private String middleName;
    @Size(max = 50)
    private String motherName;
    @Size(max = 50)
    private String fatherName;
    @NotBlank(message = "This field is required")
    private String gender;
    @NotBlank(message = "Doğum tarihi boş olamaz")
    @Pattern(regexp = "(0[1-9]|[12][0-9]|3[01])/((0[1-9]|1[0-2])|13)/\\d{4}", message = "Doğum tarihi 'Gün/Ay/Yıl' formatında olmalıdır")
    //@ValidDate(message = "Doğum tarihi 'Gün/Ay/Yıl' formatında olmalı ve geçerli bir tarih olmalıdır")
    private Date birthDate;


    /*@OneToMany
    @JoinColumn(name = "address_id")
    private List<Address> addresses;*/

   /* @OneToOne
    @JoinColumn(name = "contact_id")
    private Contact contact;*/
}
