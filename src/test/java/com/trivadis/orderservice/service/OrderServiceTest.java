package com.trivadis.orderservice.service;

import com.trivadis.orderservice.entity.Order;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class OrderServiceTest {

    @Test
    public void testFindAll() {
        // Given
        OrderServiceImpl service = new OrderServiceImpl();
        service.setOrderRepository(new OrderTestRepository());

        // When
        List<Order> all = service.findAll();

        // Then
        assertEquals(1, all.size());
        assertEquals(4711l, all.get(0).getId());
    }
}
