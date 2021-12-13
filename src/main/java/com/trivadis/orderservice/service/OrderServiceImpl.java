package com.trivadis.orderservice.service;

import com.trivadis.orderservice.entity.Order;
import com.trivadis.orderservice.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.List;

@Component
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderRepository orderRepository;

    @PostConstruct
    public void init() {
        System.out.println(orderRepository.getClass());
    }

    public List<Order> findAll() {
        return orderRepository.findAll();
    }

    public Order create(Order order) {
        return orderRepository.save(order);
    }

    public void setOrderRepository(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }
}
