package com.jocata.order.dao.impl;

import com.jocata.order.dao.OrderDao;
import com.jocata.order.entity.OrderEntity;
import com.jocata.order.form.OrderDetails;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class OrderDaoImpl implements OrderDao {

    Map<Integer,OrderEntity> orderEntityMap = new HashMap<>();
    @Override
    public void createOrder(OrderEntity orderEntity) {
        orderEntityMap.put(orderEntity.getOrderId(),orderEntity);
        System.out.println("Order added : "+orderEntity);
    }

    @Override
    public void updateOrder(OrderEntity orderEntity) {
        OrderEntity existing =orderEntityMap.get(orderEntity.getOrderId());
        if(existing!=null)
        {
            if(orderEntity.getCustomerName()!=null && !orderEntity.getCustomerName().isEmpty())
            {
                existing.setCustomerName(orderEntity.getCustomerName());
            }
            if(orderEntity.getOrderDate()!=null)
            {
                existing.setOrderDate(orderEntity.getOrderDate());
            }
            if(orderEntity.getItem()!=null && !orderEntity.getItem().isEmpty())
            {
                existing.setItem(orderEntity.getItem());
            }
            if(orderEntity.getTotalAmount()==0 )
            {
                existing.setTotalAmount(orderEntity.getTotalAmount());
            }
            if(orderEntity.getStatus()!=null && !orderEntity.getStatus().isEmpty())
            {
                existing.setStatus(orderEntity.getStatus());
            }
            System.out.println("Updated order : " + existing);
        }else{
            System.out.println("Order details not found");
        }


    }

    @Override
    public List<OrderEntity> getAllOrders() {
        return new ArrayList<>(orderEntityMap.values());
    }


    @Override
    public OrderEntity getOrder(int id) {
        return orderEntityMap.get(id);
    }

    @Override
    public void cancelOrder(int id) {
        OrderEntity cancelled = orderEntityMap.remove(id);
        if(cancelled!=null) {
            System.out.println("Order cancelled with id " + id);
            System.out.println(cancelled);
        }else{
            System.out.println("Order not found with id : "+id);
        }

    }
}
