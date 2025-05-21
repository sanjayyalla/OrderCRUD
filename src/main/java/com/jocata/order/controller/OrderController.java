package com.jocata.order.controller;

import com.jocata.order.entity.OrderEntity;
import com.jocata.order.form.OrderDetails;
import com.jocata.order.service.impl.OrderService;
import com.jocata.order.service.impl.OrderServiceImpl;

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
