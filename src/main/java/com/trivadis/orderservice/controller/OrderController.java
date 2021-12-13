package com.trivadis.orderservice.controller;

import com.trivadis.orderservice.entity.Order;
import com.trivadis.orderservice.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class OrderController {

    @Autowired
    private OrderService orderService;

    @GetMapping("/order")
    public List<Order> findAll() {
        return orderService.findAll();
    }

    @PostMapping("/order")
    public Order create(@RequestBody Order order) {
        return orderService.create(order);
    }

}
