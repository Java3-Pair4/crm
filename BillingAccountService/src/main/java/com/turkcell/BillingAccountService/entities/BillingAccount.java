package com.turkcell.BillingAccountService.entities;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Billing_Account")
public class BillingAccount {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name="status")
    private boolean status;
    @Column(name="accountNumber")
    private String accountNumber;
    @Column(name="accountName")
    private String accountName;







   // private String customerId;
    private boolean orderId;
}
