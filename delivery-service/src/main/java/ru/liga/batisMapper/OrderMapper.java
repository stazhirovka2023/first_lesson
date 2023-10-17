package ru.liga.batisMapper;

import ru.liga.entities.Order;

import java.util.List;

public interface OrderMapper {
    List<Order> getOrderByStatus(String status);

    void updateOrderStatus(Order order);
}
