package srs.customerservice.Entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity

@Table(name="contact_medium")
public class Contact {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String email;


    private String gsmNumber;


    private String homeNumber;

    private String fax;

    public Contact(int id, String email, String gsmNumber, String homeNumber, String fax) {
        this.id = id;
        this.email = email;
        this.gsmNumber = gsmNumber;
        this.homeNumber = homeNumber;
        this.fax = fax;
    }

    public Contact(int id, String email, String gsmNumber, String homeNumber, String fax, Customer customer) {
        this.id = id;
        this.email = email;
        this.gsmNumber = gsmNumber;
        this.homeNumber = homeNumber;
        this.fax = fax;
        this.customer = customer;
    }

    public Contact() {
    }

    @ManyToOne
    @JoinColumn(name = "customer_id")

    private Customer customer;
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGsmNumber() {
        return gsmNumber;
    }

    public void setGsmNumber(String gsmNumber) {
        this.gsmNumber = gsmNumber;
    }

    public String getHomeNumber() {
        return homeNumber;
    }

    public void setHomeNumber(String homeNumber) {
        this.homeNumber = homeNumber;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }
}
