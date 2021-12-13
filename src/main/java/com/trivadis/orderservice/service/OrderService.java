package com.trivadis.orderservice.service;

import com.trivadis.orderservice.entity.Order;

import java.util.List;

public interface OrderService {

    List<Order> findAll();

    Order create(Order order);
}
