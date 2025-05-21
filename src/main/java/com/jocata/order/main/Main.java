package com.jocata.order.main;

import com.jocata.order.controller.OrderController;
import com.jocata.order.entity.OrderEntity;
import com.jocata.order.form.OrderDetails;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        OrderController controller = new OrderController();
        while (true) {
            System.out.println("Enter your choice : 1.Create order 2. Get Order Details 3. Update Order 4. Cancel Order 5. Get All orders 6. Exit");
            int n = sc.nextInt();
            switch (n) {
                case 1:
                    OrderDetails orderDetails = new OrderDetails();
                    System.out.print("Enter Order ID: ");
                    orderDetails.setOrderId(sc.nextInt());
                    System.out.print("Enter Customer name: ");
                    orderDetails.setCustomerName(sc.next());
                    System.out.print("Enter Order Date:");
                    orderDetails.setOrderDate(sc.next());
                    System.out.print("Enter Item:");
                    orderDetails.setItem(sc.next());
                    System.out.print("Enter Total amount:");
                    orderDetails.setTotalAmount(sc.nextDouble());
                    System.out.print("Enter Status:");
                    orderDetails.setStatus(sc.next());
                    controller.createOrder(orderDetails);
                    break;
                case 2:
                    System.out.println("Enter order id to get details : ");
                    int id = sc.nextInt();
                    OrderEntity searchedOrder = controller.getOrder(id);
                    if (searchedOrder != null) {

                        System.out.println("Searched Order : ");
                        System.out.println(searchedOrder);
                    } else {
                        System.out.println("Order not found");
                    }

                    break;
                case 3:
                    OrderDetails orderDetails1 = new OrderDetails();
                    System.out.println("Enter employee id to update : ");
                    orderDetails1.setOrderId(sc.nextInt());
                    System.out.print("Enter Customer name: ");
                    orderDetails1.setCustomerName(sc.next());
                    System.out.print("Enter Order Date:");
                    orderDetails1.setOrderDate(sc.next());
                    System.out.print("Enter Item:");
                    orderDetails1.setItem(sc.next());
                    System.out.print("Enter Total amount:");
                    orderDetails1.setTotalAmount(sc.nextDouble());
                    System.out.print("Enter Status:");
                    orderDetails1.setStatus(sc.next());
                    controller.updateOrder(orderDetails1);
                    break;
                case 4:
                    System.out.println("Enter order Id to cancel :");
                    int deleteId = sc.nextInt();
                    controller.cancelOrder(deleteId);
                    break;
                case 5:
                    System.out.println("All Order are----------");
                    List<OrderEntity> allOrders= controller.getAllOrders();
                    System.out.println(allOrders);
                    break;
                case 6:
                    System.exit(0);

                default:
                    System.out.println("Enter correct option ");

            }
        }
    }

}
