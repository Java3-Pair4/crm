package com.pair4crm.productservice.entities;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name="categories")
public class Categori {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @OneToMany(mappedBy = "categori", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Product> products;


}
