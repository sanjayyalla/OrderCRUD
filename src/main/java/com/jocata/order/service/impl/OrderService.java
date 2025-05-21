package com.jocata.order.service.impl;

import com.jocata.order.entity.OrderEntity;
import com.jocata.order.form.OrderDetails;

import java.util.List;

public interface OrderService {

    public void createOrder(OrderDetails orderDetails);

    public void updateOrder(OrderDetails orderDetails);

    public List<OrderEntity> getAllOrders();

    public OrderEntity getOrder(int id);

    public void cancelOrder(int id);
}

