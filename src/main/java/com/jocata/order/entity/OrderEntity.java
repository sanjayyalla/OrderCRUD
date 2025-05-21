package com.jocata.order.entity;

public class OrderEntity {
    private int orderId;
    private String customerName;
    private String orderDate;
    private String item;
    private double totalAmount;
    private String status;

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(String orderDate) {
        this.orderDate = orderDate;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "OrderEntity{" +
                "orderId=" + orderId +
                ", customerName='" + customerName + '\'' +
                ", orderDate='" + orderDate + '\'' +
                ", item='" + item + '\'' +
                ", totalAmount=" + totalAmount +
                ", status='" + status + '\'' +
                '}';
    }
}
