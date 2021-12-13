package com.trivadis.orderservice.controller;

import com.trivadis.orderservice.entity.Order;
import com.trivadis.orderservice.service.OrderService;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class OrderControllerTest {

    @Test
    public void testCreate() {
        OrderController orderController = new OrderController(new OrderService() {
            @Override
            public List<Order> findAll() {
                return null;
            }

            @Override
            public Order create(Order order) {
                return order;
            }
        });

        Order order = new Order();
        order.setArticleId(45l);
        // ...

        Order returnValue = orderController.create(order);

        assertNotNull(returnValue);
        assertEquals(order.getArticleId(), returnValue.getArticleId());
    }
}
