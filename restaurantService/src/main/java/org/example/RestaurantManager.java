package org.example;

import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class RestaurantManager implements Restaurant {
    private static RestaurantManager instance;

    ConcurrentHashMap<Integer, UserDetails> registeredUsers;
    ConcurrentHashMap<String, RestaurantDetails> registeredRestaurants;

    public RestaurantManager() {
        this.registeredUsers = new ConcurrentHashMap<>();
        this.registeredRestaurants = new ConcurrentHashMap<>();
    }

    Integer userId = 1;
    UserDetails userDetails;
    RestaurantDetails restaurantDetails;

    private RestaurantManager(ConcurrentHashMap<Integer, UserDetails> registeredUsers) {
        this.registeredUsers = registeredUsers;
    }

    //follow singleton design pattern
    public static synchronized RestaurantManager getInstance() {
        if (instance == null) {
            instance = new RestaurantManager();
        }
        return instance;
    }


    @Override
    public void addUserDetails(UserDetails userDetails) {
        registeredUsers.put(userId, userDetails);
        System.out.println("User added successfully");
        userId++;
    }

    @Override
    public void addRestaurantDetails(RestaurantDetails restaurantDetails) {
        registeredRestaurants.put(restaurantDetails.getName(), restaurantDetails);
        System.out.println("Restaurant added successfully");
    }

    @Override
    public void loginUser(String phoneNumber) {
        for (Map.Entry<Integer, UserDetails> entry : registeredUsers.entrySet()) {
            if (entry.getValue().getPhoneNumber().equals(phoneNumber)) {
                userDetails = entry.getValue();
                System.out.println("User logged in successfully");
                return;
            }
        }
        System.out.println("User not found");
    }

    @Override
    public List<RestaurantDetails> getRestaurantsByPriceOrRatings(FilterRestaurants filterRestaurants) {
        if(userDetails != null) {
            for (Map.Entry<String, RestaurantDetails> entry : registeredRestaurants.entrySet()) {
                if (entry.getValue().getFoodItemPrice() <= filterRestaurants.getPrice()) {
                    System.out.println("fetched restaurant by price");
                    return List.of(entry.getValue());
                }
                else if (entry.getValue().getServicebalePincodes().contains(userDetails.getLocation())) {
                    System.out.println("fetched restaurant by location");
                    return List.of(entry.getValue());
                }
            else if (entry.getValue().getRatings() >= filterRestaurants.getRating()) {
                    System.out.println("fetched restaurant by ratings");
                    return List.of(entry.getValue());
                }
            }
        } else {
            System.out.println("User not logged in");
        }
        return List.of();
    }

    @Override
    public String placeOrder(String restaurantName, String foodItem, int quantity) {
        if(userDetails != null) {
            for (Map.Entry<String, RestaurantDetails> entry : registeredRestaurants.entrySet()) {
                if (entry.getValue().getName().equals(restaurantName)) {
                    if (entry.getValue().getQuantity() >= quantity) {
                        entry.getValue().setRatings(entry.getValue().getRatings() + 1);
                        entry.getValue().setQuantity(entry.getValue().getQuantity() - quantity);
                        System.out.println("Order placed successfully");
                        return "Order placed successfully";
                    } else {
                        System.out.println("Not enough quantity available");
                        return "Not enough quantity available";
                    }
                }
            }
        } else {
            System.out.println("User not logged in");
        }
        return "Restaurant not found";
    }

    @Override
    public void addReview(String restaurantName, Integer rating, String review) {
if(userDetails!=null){
    for(Map.Entry<String,RestaurantDetails> entry: registeredRestaurants.entrySet()){
        if(entry.getValue().getName().equals(restaurantName)){
            entry.getValue().setRatings(rating);
            entry.getValue().setReviewComment("good food");
            System.out.println("Review added successfully");
            return;
        }
    }
}
    }

    @Override
    public RestaurantDetails updateLocations(String restaurantName, String location) {
        if(userDetails!=null){
            for(Map.Entry<String,RestaurantDetails> entry: registeredRestaurants.entrySet()){
                if(entry.getValue().getName().equals(restaurantName)){
                    entry.getValue().setLocation(location);
                    System.out.println("Location updated successfully");
                    return entry.getValue();
                }
            }
        } else {
            System.out.println("User not logged in");
        }
        return null;
    }
}
