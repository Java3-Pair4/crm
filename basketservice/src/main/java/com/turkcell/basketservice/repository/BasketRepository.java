package com.turkcell.basketservice.repository;

import com.turkcell.basketservice.entities.Basket;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BasketRepository extends JpaRepository<Basket, Integer> {
}
