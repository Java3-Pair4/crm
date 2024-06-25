package com.turkcell.basketservice.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "basket_ıtem")
public class BasketItem {

    @Column(name = "id")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    @Column(name = "productId")
    private String productId;

    @Column(name = "productName")
    private String productOfferName;

    @Column(name = "price")
    private double price;

    @Column(name = "campaignId")
    private String campaignId;

    public BasketItem(String id, String productId, String productOfferName, double price, String campaignId) {
        this.id = id;
        this.productId = productId;
        this.productOfferName = productOfferName;
        this.price = price;
        this.campaignId = campaignId;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getProductOfferName() {
        return productOfferName;
    }

    public void setProductOfferName(String productOfferName) {
        this.productOfferName = productOfferName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getCampaignId() {
        return campaignId;
    }

    public void setCampaignId(String campaignId) {
        this.campaignId = campaignId;
    }
}
