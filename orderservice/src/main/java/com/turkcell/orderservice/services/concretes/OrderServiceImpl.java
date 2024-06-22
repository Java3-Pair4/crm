package com.turkcell.orderservice.services.concretes;

import com.turkcell.orderservice.repositories.OrderRepository;
import com.turkcell.orderservice.services.Abstracts.OrderService;

public class OrderServiceImpl implements OrderService {

    private final OrderRepository orderRepository;

    public OrderServiceImpl(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    @Override
    public int getOrderId(int orderId) {
        return orderRepository.findById(orderId);
    }

    @Override
    public String getItems(String items) {
        return null;
    }
}
