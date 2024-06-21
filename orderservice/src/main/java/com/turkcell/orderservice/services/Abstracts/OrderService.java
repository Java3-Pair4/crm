package com.turkcell.orderservice.services.Abstracts;

import com.turkcell.orderservice.repositories.OrderRepository;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Service
public interface OrderService {


                                                       //get isteği at
    int getOrderId(@RequestParam int orderId);
    String getItems(@RequestParam String items);




}
