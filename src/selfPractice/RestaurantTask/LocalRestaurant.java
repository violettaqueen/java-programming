package selfPractice.RestaurantTask;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.Callable;

public class LocalRestaurant {
    public static void main(String[] args) {

        Restaurant localRestaurant = new Restaurant("Sato", "Tokio", 5);

        Server server1 = new Server("Mike", 124, 13.5, true, LocalDate.of(2021, 4, 2));
        Server server2 = new Server("Jane", 12, 14.5, true, LocalDate.of(2019, 5, 27));
        Server server3 = new Server("John", 154, 17.5, false, LocalDate.of(2020, 7, 12));
        Server server4 = new Server("Liza", 14, 16.5, true, LocalDate.of(2018, 5, 21));
        Server server5 = new Server("Katya", 123, 20, false, LocalDate.of(2022, 2, 20));

        Server[] servers = {server1, server2, server3, server4, server5};

        localRestaurant.hireServer(servers); // have to use method when adding to ArrayList

        Chef chef1 = new Chef("Recardo", 23, 25, true);
        Chef chef2 = new Chef("Alex", 45, 45, true);
        Chef chef3 = new Chef("Miranda", 32, 20, false);

        Chef[] chefs = {chef1, chef2, chef3};

        localRestaurant.hireChef(chefs);

        System.out.println(localRestaurant);


    }
}


/*
4.4. Create a class LocalRestaurant that has a main method with the following:
	        	- Make a Restaurant object
	        	- Create an array of servers with their information set. Add those initial servers to
	        	the ArrayList of Servers in the Restaurant object
	            - Create an array of chefs with their information set. Add those initial chefs to the
	             ArrayList of Chefs in the Restaurant object

	            - Print your whole restaurants information
 */