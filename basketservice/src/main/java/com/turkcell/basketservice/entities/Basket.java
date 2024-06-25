package com.turkcell.basketservice.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "basket")
public class Basket {

    @Id
    @Column(name = "id")
    private int  id;

    @Column(name = "customerId")
    private String customerId;

    @Column(name = "totalPrice")
    private double totalPrice;

    private List<BasketItem> basketItems;


    public Basket() {
        this.basketItems = new ArrayList<>();
    }
}
