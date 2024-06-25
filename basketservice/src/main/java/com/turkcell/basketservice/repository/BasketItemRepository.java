package com.turkcell.basketservice.repository;

import com.turkcell.basketservice.entities.BasketItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BasketItemRepository extends JpaRepository<BasketItem,Integer> {
}
