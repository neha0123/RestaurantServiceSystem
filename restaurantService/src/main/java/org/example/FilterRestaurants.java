package org.example;

public class FilterRestaurants {
    Integer rating;
    double price;
    String cuisine;

//    public FilterRestaurants(Integer rating, double price, String cuisine) {
//        this.rating = rating;
//        this.price = price;
//        this.cuisine = cuisine;
//    }

    public double getPrice() {
        return price;
    }

    public Integer getRating() {
        return rating;
    }

    public String getCuisine() {
        return cuisine;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setRating(Integer rating) {
        this.rating = rating;
    }
}
