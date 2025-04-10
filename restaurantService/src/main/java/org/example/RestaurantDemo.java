package org.example;

import java.util.ArrayList;
import java.util.List;

public class RestaurantDemo {
    void run() {
        RestaurantManager restaurantManager = RestaurantManager.getInstance();

        UserDetails user1 = new UserDetails("Pralove", "M", "1234567890", "Delhi");
        UserDetails user2 = new UserDetails("Nitesh", "M", "12345648550", "BTM");
        UserDetails user3 = new UserDetails("Surabhi", "F", "12348567890", "BTM");

        restaurantManager.addUserDetails(user1);
        restaurantManager.addUserDetails(user2);
        restaurantManager.addUserDetails(user3);

        restaurantManager.loginUser("1234567890");
        List<String> pinCode = new ArrayList<>();
        pinCode.add("BTM/HSR");
        pinCode.add("110002");


        RestaurantDetails restaurant1 = new RestaurantDetails("Food Court-1", "Near brookfield mall", "NI Thali", "1234567890", pinCode, 200.0, 2);
        RestaurantDetails restaurantDetails = new RestaurantDetails("Food Court-2", "Near Indiranagar", "NI Thali", "1234567890", pinCode, 200.0, 2);
        RestaurantDetails restaurant3 = new RestaurantDetails("Food Court-3", "Near Indiranagar", "NI Thali", "1234567890", pinCode, 200.0, 2);
        RestaurantDetails restaurant4 = new RestaurantDetails("Food Court-4", "Near Indiranagar", "NI Thali", "1234567890", pinCode, 200.0, 2);

        restaurantManager.addRestaurantDetails(restaurant1);
        restaurantManager.addRestaurantDetails(restaurantDetails);
        restaurantManager.addRestaurantDetails(restaurant3);
        restaurantManager.addRestaurantDetails(restaurant4);

        restaurantManager.addReview("Food Court-1", 5, "Good");
        FilterRestaurants filterRestaurants = new FilterRestaurants();
        filterRestaurants.setPrice(200.0);
        List<RestaurantDetails> restaurants = restaurantManager.getRestaurantsByPriceOrRatings(filterRestaurants);
        for (RestaurantDetails restaurant : restaurants) {
            System.out.println("Restaurant Name: " + restaurant.getName());
            System.out.println("Location: " + restaurant.getLocation());
            System.out.println("Cuisine Type: " + restaurant.getCuisineType());
            System.out.println("Phone Number: " + restaurant.getPhoneNumber());
            System.out.println("Serviceable Pincodes: " + restaurant.getServicebalePincodes());
            System.out.println("Food Item Price: " + restaurant.getFoodItemPrice());
            System.out.println("Quantity: " + restaurant.getQuantity());
            System.out.println();
        }

        restaurantManager.placeOrder("Food Court-1", "NI Thali", 2);
        restaurantManager.placeOrder("Food Court-2", "NI Thali", 7);

        restaurantManager.addReview("Food Court-1", 5, "Good");
        restaurantManager.addReview("Food Court-2", 4, "Good");

        filterRestaurants.setRating(4);

        List<RestaurantDetails> restaurants1 = restaurantManager.getRestaurantsByPriceOrRatings(filterRestaurants);

        restaurantManager.updateLocations("Food Court-1", "BTM/HSR");
        restaurantManager.updateLocations("Food Court-2", "BTM/HSR");

        restaurantManager.getRestaurantsByPriceOrRatings(filterRestaurants);


    }
}
