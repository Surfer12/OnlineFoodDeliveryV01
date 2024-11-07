package com.onlinefooddelivery;

public class Driver {
    private Long id;
    private String name;
    private String vehicle;
    private String licenseNumber;
    private Location currentLocation;
    private RatingsHandler ratings;

    public void acceptOrder(Order order) {
        // Implementation here
    }

    public void completeDelivery(Order order) {
        // Implementation here
    }

    public double getAverageRating() {
        // Implementation here
        return 0.0;
    }
}