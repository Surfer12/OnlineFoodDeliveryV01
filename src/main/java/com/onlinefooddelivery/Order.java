package com.onlinefooddelivery;

import java.util.Date;
import java.util.List;

public class Order {
    private Long orderId;
    private Long customerId;
    private Long driverId;
    private List<MenuItem> items;
    private OrderStatus status;
    private double totalAmount;
    private Date orderTime;

    public void addItem(MenuItem item) {
        // Implementation here
    }

    public void removeItem(MenuItem item) {
        // Implementation here
    }

    public double calculateTotal() {
        // Implementation here
        return 0.0;
    }

    public void updateStatus(OrderStatus status) {
        this.status = status;
    }
}