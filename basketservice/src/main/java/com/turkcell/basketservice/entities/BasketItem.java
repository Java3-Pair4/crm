package com.turkcell.basketservice.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "basket_ıtem")
public class BasketItem {
    @Id
    @Column(name = "id")
    private String id;

    @Column(name = "productOfferId")
    private String productOfferId;

    @Column(name = "productOfferName")
    private String productOfferName;

    @Column(name = "price")
    private double price;

    @Column(name = "campaignId")
    private String campaignId;
}
