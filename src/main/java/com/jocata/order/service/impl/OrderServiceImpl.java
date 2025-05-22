package com.jocata.order.service.impl;

import com.jocata.order.dao.OrderDao;
import com.jocata.order.dao.impl.OrderDaoImpl;
import com.jocata.order.entity.OrderEntity;
import com.jocata.order.form.OrderDetails;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

public class OrderServiceImpl implements  OrderService{
    OrderDao dao = new OrderDaoImpl();
    @Override
    public void createOrder(OrderDetails orderDetails) {
        OrderEntity orderEntity = new OrderEntity();
        orderEntity.setOrderId(orderDetails.getOrderId());
        orderEntity.setCustomerName(orderDetails.getCustomerName());
//        orderEntity.setOrderDate(orderDetails.getOrderDate());
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate orderDate = LocalDate.parse(orderDetails.getOrderDate(), formatter);
        orderEntity.setOrderDate(orderDate);
        orderEntity.setTotalAmount(orderDetails.getTotalAmount());
        orderEntity.setItem(orderDetails.getItem());
        orderEntity.setStatus(orderDetails.getStatus());
        dao.createOrder(orderEntity);
    }

    @Override
    public void updateOrder(OrderDetails orderDetails) {
        OrderEntity orderEntity = new OrderEntity();
        orderEntity.setOrderId(orderDetails.getOrderId());
        orderEntity.setCustomerName(orderDetails.getCustomerName());
//        orderEntity.setOrderDate(orderDetails.getOrderDate());
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate orderDate = LocalDate.parse(orderDetails.getOrderDate(), formatter);
        orderEntity.setOrderDate(orderDate);
        orderEntity.setTotalAmount(orderDetails.getTotalAmount());
        orderEntity.setItem(orderDetails.getItem());
        orderEntity.setStatus(orderDetails.getStatus());
        dao.updateOrder(orderEntity);

    }

    @Override
    public List<OrderEntity> getAllOrders() {
        List<OrderEntity> list = dao.getAllOrders();
        return list;
    }

    @Override
    public OrderEntity getOrder(int id) {

        OrderEntity orderEntity = dao.getOrder(id);
        return orderEntity;
    }

    @Override
    public void cancelOrder(int id) {
        dao.cancelOrder(id);

    }
}
