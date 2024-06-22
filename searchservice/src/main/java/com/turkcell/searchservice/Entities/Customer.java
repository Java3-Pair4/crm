package com.turkcell.searchservice.Entities;

import jakarta.persistence.Column;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name="search-customers")
public class Customer {

    @Column(name="customer_id")
    private String customerId;

    @Column(name="nationality_id")
    private String nationalityId;

    @Column(name="account_number")
    private String accountNumber;

    @Column(name="gsm_number")
    private String gsmNumber;

    @Column(name="first_name")
    private String firstName;

    @Column(name="last_name")
    private String lastName;

}
