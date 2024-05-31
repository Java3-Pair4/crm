package srs.customerservice.Services.DTOs.Request;

import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class AddCustomerRequest {

   /* @NotBlank
    @Size(min=11,max= 11)
    @Positive
    private Long nationalityID;*/

    @NotEmpty(message = "Nationality ID cannot be empty")
    @Pattern(regexp = "\\d{11}")
    private String nationalityID;



    @Positive
    private String accountNumber;

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

    @NotBlank(message = "This field is required")
    @DateTimeFormat(pattern = "dd-MM-yyyy")
    private LocalDate birthDate;
    //@Pattern(regexp = "(0[1-9]|[12][0-9]|3[01])/((0[1-9]|1[0-2])|13)/\\d{4}", message = "Doğum tarihi 'Gün/Ay/Yıl' formatında olmalıdır")
    //@ValidDate(message = "Doğum tarihi 'Gün/Ay/Yıl' formatında olmalı ve geçerli bir tarih olmalıdır")



    /*@OneToMany
    @JoinColumn(name = "address_id")
    private List<Address> addresses;*/

   /* @OneToOne
    @JoinColumn(name = "contact_id")
    private Contact contact;*/
}
