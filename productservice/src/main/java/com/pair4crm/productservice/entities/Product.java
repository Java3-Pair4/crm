package com.pair4crm.productservice.entities;


import jakarta.persistence.*;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name= "products")
public class Product {
    @Id
    @Column(name="id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name="name")
    private String name;


    @Column(name="prodChar")
    private String prodChar;

   // @Column(name="adresses")
   // private String adress;

    @ElementCollection
    @CollectionTable(name = "product_addresses", joinColumns = @JoinColumn(name = "product_id"))
    @Column(name = "address")
    private List<String> addresses = new ArrayList<>();


    @Column(name="start_Dates")
    private Date startDate;


    // TODO: Check the items


    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "category_id")
    private Categori categori;

    public Product(int id, String name, String prodChar, List<String> addresses, Date startDate, Categori categori) {
        this.id = id;
        this.name = name;
        this.prodChar = prodChar;
        this.addresses = addresses;
        this.startDate = startDate;
        this.categori = categori;
    }

    public List<String> getAddresses() {
        return addresses;
    }

    public void setAddresses(List<String> addresses) {
        this.addresses = addresses;
    }

    public Product() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProdChar() {
        return prodChar;
    }

    public void setProdChar(String prodChar) {
        this.prodChar = prodChar;
    }



    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Categori getCategori() {
        return categori;
    }

    public void setCategori(Categori categori) {
        this.categori = categori;
    }

    public void addAddress(String address) {
        this.addresses.add(address);
    }


}
