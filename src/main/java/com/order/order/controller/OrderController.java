package com.order.order.controller;

import com.order.order.entity.OrderEntity;
import com.order.order.form.OrderDetails;
import com.order.order.service.impl.OrderService;
import com.order.order.service.impl.OrderServiceImpl;

import java.util.List;

public class OrderController {

    OrderService service = new OrderServiceImpl();
    public void createOrder(OrderDetails orderDetails)
    {
        if(orderDetails!=null)
        {
            service.createOrder(orderDetails);
        }
    }
    public void updateOrder(OrderDetails orderDetails)
    {
        if(orderDetails!=null)
        {
            service.updateOrder(orderDetails);
        }
    }
    public List<OrderEntity> getAllOrders()
    {
        List<OrderEntity> allOrders = service.getAllOrders();
        return allOrders;

    }
    public  OrderEntity getOrder(int id)
    {
        return service.getOrder(id);
    }
    public void cancelOrder(int id)
    {

        service.cancelOrder(id);
    }
}
