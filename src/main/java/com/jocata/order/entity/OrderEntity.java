package com.jocata.order.entity;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class OrderEntity {
    private int orderId;
    private String customerName;
    private LocalDate orderDate;
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

    public LocalDate getOrderDate() {

        return orderDate;
    }
    public String getFormattedOrderDate() {
        if (orderDate == null) return "";
        DateTimeFormatter outputFormatter = DateTimeFormatter.ofPattern("EEEE, MMMM dd, yyyy");
        return orderDate.format(outputFormatter);
    }
    public void setOrderDate(LocalDate orderDate) {
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
                ", orderDate='" + getFormattedOrderDate() + '\'' +
                ", item='" + item + '\'' +
                ", totalAmount=" + totalAmount +
                ", status='" + status + '\'' +
                '}';
    }
}
