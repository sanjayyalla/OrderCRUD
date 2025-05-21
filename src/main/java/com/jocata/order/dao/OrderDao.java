package com.jocata.order.dao;

import com.jocata.order.entity.OrderEntity;
import com.jocata.order.form.OrderDetails;

import java.util.List;

public interface OrderDao {

    public void createOrder(OrderEntity orderEntity);

    public void updateOrder(OrderEntity orderEntity);

    public List<OrderEntity> getAllOrders();

    public OrderEntity getOrder(int id);

    public void cancelOrder(int id);
}
