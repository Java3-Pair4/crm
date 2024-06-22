package srs.customerservice.Services.DTOs.Request.Customer;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class SearchCustomerRequest {

    private String customerId;
    private String nationalityId;
    private String accountNumber;
    private String gsmNumber;
    private String firstName;

    private String lastName;
    //TODO: ADD ORDER NUMBER

}
