package org.example;

import java.util.List;

public interface Restaurant {
    void addUserDetails(UserDetails userDetails);
    void addRestaurantDetails(RestaurantDetails restaurantDetails);

    void loginUser(String phoneNumber);

    List<RestaurantDetails> getRestaurantsByPriceOrRatings(FilterRestaurants filterRestaurants);

    String placeOrder(String restaurantName, String foodItem, int quantity);

    void addReview(String restaurantName,Integer rating,  String review);

    RestaurantDetails updateLocations(String restaurantName, String location);

}
