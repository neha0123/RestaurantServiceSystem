package org.example;

public class FoodItemDetails {
    private final String foodName;
    private final String foodType;
    private final double price;
    private final String quantity;

    public FoodItemDetails(String foodName, String foodType, double price, String quantity) {
        this.foodName = foodName;
        this.foodType = foodType;
        this.price = price;
        this.quantity = quantity;
    }

    public String getFoodName() {
        return foodName;
    }

    public String getFoodType() {
        return foodType;
    }

    public double getPrice() {
        return price;
    }

    public String getQuantity() {
        return quantity;
    }
}
