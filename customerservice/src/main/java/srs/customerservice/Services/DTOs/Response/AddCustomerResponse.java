package srs.customerservice.Services.DTOs.Response;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
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
}
