package srs.customerservice.Entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;
import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "customers")
public class Customer {

    @Column(name="id")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name="customer_id")
    private String customerID;
    @Column(name="nationality_id")
    private String nationalityID;
    @Column(name="account_number")
    private String accountNumber;
    @Column(name="first_name")
    private String firstName;
    @Column(name="last_name")
    private String lastName;
    @Column(name="middle_name")
    private String middleName;
    @Column(name="mother_name")
    private String motherName;
    @Column(name="father_name")
    private String fatherName;
    @Column(name="gender")
    private String gender;
    @Column(name="birth_date")
    private Date birthDate;
    @OneToMany
    @JoinColumn(name = "address_id")
    private List<Address> addresses;

    @OneToOne
    @JoinColumn(name = "contact_id")
    private Contact contact;

}
