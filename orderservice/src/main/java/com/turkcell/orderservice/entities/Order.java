package com.turkcell.orderservice.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Table(name= "orders")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;
    private String items;
    private String serviceAddress;
    private double totalAmount;
    private Date orderDate;
    private String customerID;
    private int price;


}
