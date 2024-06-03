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



    @NotEmpty(message = "Nationality ID cannot be empty")
    @Pattern(regexp = "\\d{11}")
    private String nationalityID;




    private String accountNumber;

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


    /*@OneToMany
    @JoinColumn(name = "address_id")
    private List<Address> addresses;*/

   /* @OneToOne
    @JoinColumn(name = "contact_id")
    private Contact contact;*/
}
