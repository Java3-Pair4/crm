package srs.customerservice.Entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.PastOrPresent;
import jakarta.validation.constraints.Pattern;

import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "customers")
public class Customer {

    @Column(name="id")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name="customer_id")
    private String customerID;
    @Column(name="nationality_id")
    private String nationalityId;
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
    private @NotNull(message = "Birth Date boş bırakılamaz.")
    @PastOrPresent(message = "Birth Date içinde bulunulan yıldan büyük bir değer girilememelidir. ") LocalDate birthDate;


    @OneToMany(mappedBy = "customer", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Address> addresses;

    @OneToMany(mappedBy = "customer", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Contact> contacts;



    public Customer() {
    }

    public Customer(int id, String customerID, String nationalityID, String accountNumber, String firstName, String lastName, String middleName, String motherName, String fatherName, String gender, @NotNull(message = "Birth Date boş bırakılamaz.") @PastOrPresent(message = "Birth Date içinde bulunulan yıldan büyük bir değer girilememelidir. ") LocalDate birthDate) {
        this.id = id;
        this.customerID = customerID;
        this.nationalityId = nationalityID;
        this.accountNumber = accountNumber;
        this.firstName = firstName;
        this.lastName = lastName;
        this.middleName = middleName;
        this.motherName = motherName;
        this.fatherName = fatherName;
        this.gender = gender;
        this.birthDate = birthDate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCustomerID() {
        return customerID;
    }

    public void setCustomerID(String customerID) {
        this.customerID = customerID;
    }

    public String getNationalityID() {
        return nationalityId;
    }

    public void setNationalityID(String nationalityID) {
        this.nationalityId = nationalityID;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getMotherName() {
        return motherName;
    }

    public void setMotherName(String motherName) {
        this.motherName = motherName;
    }

    public String getFatherName() {
        return fatherName;
    }

    public void setFatherName(String fatherName) {
        this.fatherName = fatherName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public @NotNull(message = "Birth Date boş bırakılamaz.") @PastOrPresent(message = "Birth Date içinde bulunulan yıldan büyük bir değer girilememelidir. ") LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(@NotNull(message = "Birth Date boş bırakılamaz.") @PastOrPresent(message = "Birth Date içinde bulunulan yıldan büyük bir değer girilememelidir. ") LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public void setNationalityId(@NotNull(message = "Nationality ID boş bırakılamaz.") @Pattern(regexp = "^[1-9][0-9]{10}$", message = "Nationality ID 11 haneli pozitif tam sayı olmalıdır.") String nationalityId) {

    }


}
