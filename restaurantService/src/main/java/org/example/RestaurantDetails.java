package org.example;

import java.util.List;

public class RestaurantDetails {
    private final String name;
    private  String location;
    private final String cuisineType;
    private final String phoneNumber;
 private  final List<String> servicebalePincodes;
    private  final Double foodItemPrice;
    private   Integer quantity;
    private  Integer ratings;
    private String reviewComment;


    public RestaurantDetails(String name, String location, String cuisineType, String phoneNumber, List<String> servicebalePincodes, Double price, Integer qty) {
        this.name = name;
        this.location = location;
        this.cuisineType = cuisineType;
        this.phoneNumber = phoneNumber;
        this.servicebalePincodes = servicebalePincodes;
        this.foodItemPrice=price;
        this.quantity=qty;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setReviewComment(String reviewComment) {
        this.reviewComment = reviewComment;
    }

    public String getReviewComment() {
        return reviewComment;
    }

    public Double getFoodItemPrice() {
        return foodItemPrice;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public String getName() {
        return name;
    }

    public String getLocation() {
        return location;
    }

    public String getCuisineType() {
        return cuisineType;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }
    public List<String> getServicebalePincodes() {
        return servicebalePincodes;
    }

    public void setRatings(Integer ratings) {
        this.ratings = ratings;
    }
public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Integer getRatings() {
        return ratings;
    }
}
