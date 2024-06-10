package com.turkcell.orderservice.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name= "orders")
public class Order {

    private String id;
    private Date orderDate;
    private String customerID;
    private double totalPrice;
    private String serviceAddress;
    private int price;
}
