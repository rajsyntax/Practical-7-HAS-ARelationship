package Practical_7.Order_OrderItem_System;


public class Order {

    private int orderId;
    private String customerName;

    private OrderItem[] items = new OrderItem[10];
    private int count = 0;

    public Order(int orderId, String customerName) {
        this.orderId = orderId;
        this.customerName = customerName;
    }

    public void addItem(int productId, String productName,
                        double price, int quantity) {

        items[count] = new OrderItem(productId, productName, price, quantity);
        count++;
    }

    public void removeItem(int index) {

        if (index >= 0 && index < count) {

            for (int i = index; i < count - 1; i++) {
                items[i] = items[i + 1];
            }

            items[count - 1] = null;
            count--;
        }
    }

    public double calculateTotalAmount() {

        double total = 0;

        for (int i = 0; i < count; i++) {
            total += items[i].calculateItemTotal();
        }

        return total;
    }

    public void displayOrderDetails() {

        System.out.println("Order ID: " + orderId);
        System.out.println("Customer Name: " + customerName);

        System.out.println("\nOrder Items:");

        for (int i = 0; i < count; i++) {
            items[i].displayItemDetails();
        }

        System.out.println("Total Amount: " + calculateTotalAmount());
    }
}
