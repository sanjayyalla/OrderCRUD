package com.order.order.service.impl;

import com.order.order.entity.OrderEntity;
import com.order.order.form.OrderDetails;

import java.util.List;

public interface OrderService {

    public void createOrder(OrderDetails orderDetails);

    public void updateOrder(OrderDetails orderDetails);

    public List<OrderEntity> getAllOrders();

    public OrderEntity getOrder(int id);

    public void cancelOrder(int id);
}

