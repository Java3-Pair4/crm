package com.turkcell.basketservice.entities.repository;

import com.turkcell.basketservice.entities.Basket;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BasketRepository extends JpaRepository<Basket, Integer> {
}
