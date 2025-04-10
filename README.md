# RestaurantServiceSystem

Design Restaurant Management System: ClearFood

Overview:

Restaurants can serve in multiple areas (identified by Pincode)
Location - At a time, users can order from one restaurant, and the quantity of food can be more than one.
Rating - Users should be able to rate any restaurant with or without comment. Rating of a restaurant is the average rating given by all customers.

Functional Requirements:

register_restaurant(resturant_name, list of serviceable pin-codes, food item name, food item price, initial quantity) -> Register Restaurant
update_quantity(restaurant name, quantity to Add) -> Restaurant owners should be able to increase the quantity of the food item:
rate_restaurant(restaurant name, rating, comment) -> Users should be able to rate(1(Lowest)-5(Highest)) any restaurant with or without comment.
show_restaurant(rating/price) -> User should be able to get list of all serviceable restaurant, food item name and price in descending order, based on rating, possibly based on price
place_order(restaurant name, quantity): A restaurant is serviceable when it delivers to the user's pincode and has a non-zero quantity of food item. Place an order from any restaurant with any allowed quantity.
order_history(username) -> Order History of User: For a given user you should be able to fetch order history.
Note:-
We can use in memory DB
Do not create any UI for the application
We can have driver class to simulate all these Operation

Expectations:-

Code Completion : Working Executable Code
Feature Coverage
Design Principles
Sample flow

User Registration :
register_user(“Pralove”, “M”, “phoneNumber-1”, “HSR”)
register_user(“Nitesh”, “M”, “phoneNumber-2”, “BTM”)
register_user(“Vatsal”, “M”, “phoneNumber-3”, “BTM”)
login_user(“phoneNumber-1”)

Restaurant Registration :
register_restaurant(“Food Court-1”, “BTM/HSR”, “NI Thali”, 100, 5)
NOTE: we will have 2 delimiters in input : ',' to specify separate fields & '/' to identify different pincodes.
register_restaurant(“Food Court-2”, “BTM/pincode-2”, “Burger”, 120, 3)
login_user(“phoneNumber-2”)
register_restaurant(“Food Court-3”, “HSR”, “SI Thali”, 150, 1)
login_user(“phoneNumber-3”)

Fetch Restaurant List :
show_restaurant(“Price”) —-> Output : Food Court-2, Burger | Food Court-1, NI Thali

Place Order :
place_order(“Food Court-1”, 2) —-> Output: Order Placed Successfully.
place_order(““Food Court-2”, 7) —-> Output : Cannot place order

Add Review :
create_review(“Food Court-2”, 3, “Good Food”)
create_review(“Food Court-1”, 5, “Nice Food”)

show_restaurant(“rating”) —->
Output : Food Court-1, NI Thali Food Court-2, Burger

login_user(“phoneNumber-1”) —> update_quantity(“Food Court-2”, 5)
Output: Food Court-2, BTM, Burger - 8

update_location(“Food Court-2”, “BTM/HSR”) —>
Output: Food Court-2, “BTM/HSR”, Burger - 8

Additional Notes:

The round was of 1:30 hours duration, which consisted of problem understanding, performing the actual implementation, on a language of your choice on your local editor, and then discussion.
Since the time was limited, interviewer was interested majorly on the model design, and implementations of the methods was dependant on the remaining timeframe. But this was not communicated properly, and later on I was told that my model implementations are not extensible as per the overall problem statement. The interviewer started comparing that how will my solution work for existing features in Zomato, in which I told that I considered the design as per the current problem statement, and not a general one.
Overall, I would say that even the interviewer was not clear if the expectations are as per a general machine coding round or an LLD design round. I communicated the same and he became infuriated, and later on gave me no hire, which I expected :)
If someone goes for interview with them in future, I would only advise them to clarify the expectations properly beforehand, and ask them what is their priority (model/schema design or actual working code), since time is very less for a complete implementation.
