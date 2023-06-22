package com.yohersa.service;

import com.yohersa.model.Order;

import java.util.List;

public interface OrderService {

    List<Order> findAllOrders();

    Order saveOrder(Order order);
}
