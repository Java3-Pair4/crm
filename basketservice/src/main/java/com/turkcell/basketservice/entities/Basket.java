package com.turkcell.basketservice.entities;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "basket")
public class Basket {


    @Column(name = "id")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int  id;

    @Column(name = "customerId")
    private String customerId;

    @Column(name = "totalPrice")
    private double totalPrice;

    private List<BasketItem> basketItems;


    public Basket() {
        this.basketItems = new ArrayList<>();
    }

    public Basket(int id, String customerId, double totalPrice, List<BasketItem> basketItems) {
        this.id = id;
        this.customerId = customerId;
        this.totalPrice = totalPrice;
        this.basketItems = basketItems;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public List<BasketItem> getBasketItems() {
        return basketItems;
    }

    public void setBasketItems(List<BasketItem> basketItems) {
        this.basketItems = basketItems;
    }
}
