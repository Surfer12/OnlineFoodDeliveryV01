package com.onlinefooddelivery;

public class MenuItem {
    private Long id;
    private String name;
    private String description;
    private double price;
    private String category;
    private int preparationTime;

    public MenuItem(Long id, String name, String description, double price, String category, int preparationTime) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
        this.category = category;
        this.preparationTime = preparationTime;
    }

    public void updatePrice(double price) {
        this.price = price;
    }

    public boolean isAvailable() {
        // Logic to determine availability
        return true; // Placeholder
    }

    public String getDetails() {
        return String.format("Name: %s, Description: %s, Price: %.2f, Category: %s, Preparation Time: %d mins",
                name, description, price, category, preparationTime);
    }

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getPreparationTime() {
        return preparationTime;
    }

    public void setPreparationTime(int preparationTime) {
        this.preparationTime = preparationTime;
    }
}