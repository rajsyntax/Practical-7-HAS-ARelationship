package Practical_7.Order_OrderItem_System;

public class OrderItem {

    private int productId;
    private String productName;
    private double price;
    private int quantity;

    public OrderItem(int productId, String productName, double price, int quantity) {
        this.productId = productId;
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
    }

    public double calculateItemTotal() {
        return price * quantity;
    }

    public void displayItemDetails() {
        System.out.println("Product ID: " + productId);
        System.out.println("Product Name: " + productName);
        System.out.println("Price: " + price);
        System.out.println("Quantity: " + quantity);
        System.out.println("Item Total: " + calculateItemTotal());
        System.out.println();
    }
}
