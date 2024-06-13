package com.pair4crm.productservice.entities;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.sql.Date;

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

    @Column(name="adresses")
    private String adress;

    @Column(name="start_Dates")
    private Date startDate;


    // TODO: Check the items


    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "category_id")
    private Categori categori;

    public Product(int id, String name, String prodChar, String adress, Date startDate, Categori categori) {
        this.id = id;
        this.name = name;
        this.prodChar = prodChar;
        this.adress = adress;
        this.startDate = startDate;
        this.categori = categori;
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

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
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
}
