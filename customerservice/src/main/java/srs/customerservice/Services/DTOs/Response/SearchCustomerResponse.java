package srs.customerservice.Services.DTOs.Response;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class SearchCustomerResponse {
    private String customerId;
    private String nationalityId;
    private String accountNumber;
    private String firstName;
    private String lastName;
    //TODO: ADD ROLE
}
