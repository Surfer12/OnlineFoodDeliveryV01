package com.onlinefooddelivery;

import java.util.List;

public class Customer {
    private Long id;
    private String name;
    private String address;
    private String phone;
    private String email;

    public Customer(Long id, String name, String address, String phone, String email) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.email = email;
    }

    public Order placeOrder(List<MenuItem> items) {
        // Implementation for placing an order
        return new Order(); // Placeholder return
    }

    public void rateDriver(Driver driver, int score) {
        // Implementation for rating a driver
    }

    public List<Order> getOrderHistory() {
        // Implementation for retrieving order history
        return null; // Placeholder return
    }
}