package com.turkcell.searchservice.Services.Dto.Request;

import jakarta.persistence.Column;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class SearchCustomerRequest {
    @Positive(message = "Nationality ID must be a positive number")
    @Size(max = 7, message = "Nationality ID must be exactly 7 digits")
    @Column(name="customer_id")
    private String customerId;

    @Column(name="nationality_id")
    @Positive(message = "Nationality ID must be a positive number")
    @Size(min = 11, max = 11, message = "Nationality ID must be exactly 11 digits")
    private String nationalityId;

    @Positive(message = "Account Number must be a positive number")
    @Column(name="account_number")
    private String accountNumber;

    @Positive(message = "GSM Number must be a positive number")
    @Size(min = 11, max = 11, message = "GSM Number must be exactly 11 digits")
    @Column(name="gsm_number")
    private String gsmNumber;

    @Column(name="first_name")
    private String firstName;

    @Column(name="last_name")
    private String lastName;
}
