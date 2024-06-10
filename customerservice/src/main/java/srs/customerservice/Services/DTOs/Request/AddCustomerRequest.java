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


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class AddCustomerRequest {


    private String customerID;

    @NotEmpty(message = "Nationality ID cannot be empty")
    @Pattern(regexp = "\\d{11}")
    private String nationalityID;

    private String accountNumber;

    @Pattern(regexp = "[0-9\\s]{12}")
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
}
