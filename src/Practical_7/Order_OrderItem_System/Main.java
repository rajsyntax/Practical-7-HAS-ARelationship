package Practical_7.Order_OrderItem_System;

public class Main {

    public static void main(String[] args) {

        Order order = new Order(1001, "Rajesh");

        order.addItem(101, "Laptop", 50000, 1);
        order.addItem(102, "Mouse", 500, 2);
        order.addItem(103, "Keyboard", 1500, 1);

        order.displayOrderDetails();
    }
}
