package srs.customerservice.Entities;

import jakarta.persistence.*;

@Entity
@Table(name="billing_accounts")
public class BillingAccount {

//Fatura Hesabı

//⦁	Account Status
//⦁	Account Number
//⦁	Account Name
//⦁	Account Type

    @Id
    @Column(name="id")
    @GeneratedValue(strategy = GenerationType.UUID)
    private int id;

    @Column(name="status")
    private boolean status;

    @Column(name="account_number")
    private String accountNumber;

    @Column(name="name")
    private String name;

    @Column(name="type")
    private String type;

    @ManyToOne(cascade = CascadeType.MERGE)
    @JoinColumn(name = "customer_id")
    private Customer  customer;

    @ManyToOne(cascade = CascadeType.MERGE)
    @JoinColumn(name = "address_id")
    private Address address;


}
