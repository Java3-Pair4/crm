package com.turkcell.BillingAccountService.entities;


import jakarta.persistence.Entity;
import jakarta.persistence.Table;
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
    private String accountNumber;
    private String accountName;
    private String customerId;
    private boolean orderId;
}
