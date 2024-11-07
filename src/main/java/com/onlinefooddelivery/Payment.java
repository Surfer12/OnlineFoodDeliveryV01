package com.onlinefooddelivery;

import java.util.Date;

public class Payment {
    private Long paymentId;
    private Long orderId;
    private String paymentMethod;
    private double amount;
    private Date paymentTime;

    public boolean processPayment() {
        // Logic to process the payment
        return true; // Return true if payment is successful
    }

    public boolean refundPayment() {
        // Logic to refund the payment
        return true; // Return true if refund is successful
    }
}