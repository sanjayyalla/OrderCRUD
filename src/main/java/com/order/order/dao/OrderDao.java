package com.order.order.dao;

import com.order.order.entity.OrderEntity;
import com.order.order.form.OrderDetails;

import java.util.List;

public interface OrderDao {

    public void createOrder(OrderEntity orderEntity);

    public void updateOrder(OrderEntity orderEntity);

    public List<OrderEntity> getAllOrders();

    public OrderEntity getOrder(int id);

    public void cancelOrder(int id);
}
