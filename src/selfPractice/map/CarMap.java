package selfPractice.map;

import java.util.*;
import java.util.Collections.*;

public class CarMap {

    public static void main(String[] args) {

        Map<String, Object> car1 = new Hashtable<>();
        car1.put("brand", "BMW");
        car1.put("model", "X5");
        car1.put("color", "Red");
        car1.put("year", 2021);
        car1.put("price", 55000);
        car1.put("electric", false);

        Map<String, Object> car2 = new Hashtable<>();
        car2.put("brand", "Audi");
        car2.put("model", "Q7");
        car2.put("color", "Gray");
        car2.put("year", 2022);
        car2.put("price", 50000);
        car2.put("electric", false);

        Map<String, Object> car3 = new Hashtable<>();
        car3.put("brand", "Tesla");
        car3.put("model", "Model Y");
        car3.put("color", "White");
        car3.put("year", 2020);
        car3.put("price", 60000);
        car3.put("electric", true);

        Map<String, Object> car4 = new Hashtable<>();
        car4.put("brand", "VW");
        car4.put("model", "Toureg");
        car4.put("color", "Beige");
        car4.put("year", 2016);
        car4.put("price", 32000);
        car4.put("electric", false);

        Map<String, Object> car5 = new Hashtable<>();
        car5.put("brand", "Toyota");
        car5.put("model", "Highlander");
        car5.put("color", "Gray");
        car5.put("year", 2016);
        car5.put("price", 23000);
        car5.put("electric", false);

        Map<String, Object> car6 = new Hashtable<>();
        car6.put("brand", "Tesla");
        car6.put("model", "Model Y");
        car6.put("color", "Blue");
        car6.put("year", 2021);
        car6.put("price", 60000);
        car6.put("electric", true);

        //  4.1 Create a map named myCars that takes car number as a key and car info as a value

        Map<Integer, Map<String, Object>> myCars = new LinkedHashMap<>();
        myCars.put(1, car1);
        myCars.put(2, car2);
        myCars.put(3, car3);
        myCars.put(4, car4);
        myCars.put(5, car5);
        myCars.put(6, car6);

        // 4.2 Display the brand-model-price of each car

        for (Map<String, Object> eachValue : myCars.values()) {
            for (Map.Entry<String, Object> eachEntry : eachValue.entrySet()) {

                if (eachEntry.getKey().equals("brand")) {
                    System.out.println("brand: " + eachEntry.getValue());
                } else if (eachEntry.getKey().equals("model")) {
                    System.out.println("model: " + eachEntry.getValue());
                } else if (eachEntry.getKey().equals("price")) {
                    System.out.println("price: " + eachEntry.getValue());
                }
            }
        }
        // 4.3 Display all the electric cars
        for (Map<String, Object> eachValue : myCars.values()) {
            for (Map.Entry<String, Object> eachSet : eachValue.entrySet()) {
                if (eachSet.getKey().equals("electric") && eachSet.getValue().equals(true)) {
                    System.out.println(eachValue.get("brand"));
                }
            }
        }
        System.out.println("----------------------------------------------------------------------------");
        String max = "";
        // 4.4 Display the most expensive car

        List<Integer> priceList = new LinkedList<>(); // create a Collection List with prices

        for (int i = 0; i < myCars.size(); i++) {  // iterate myCars map
            priceList.add((Integer) myCars.get(i + 1).get("price")); // add myCars to list
        }
        for (Integer key : myCars.keySet()) { // iterate list
            if (Collections.max(priceList).equals(myCars.get(key).get("price"))) {
                System.out.println("Most expensive car is : " + myCars.get(key));
            }
        }
        // 4.4 Display the most expensive car

        for (Map<String, Object> eachValue : myCars.values()) {
            for (Map.Entry<String, Object> eachEntry : eachValue.entrySet()) {

                }
            }
        }

    }

/*
Given the following maps that contains the different car information:
		
		 Map<String, Object> car1 = new Hashtable<>();
	        car1.put("brand", "BMW");
	        car1.put("model", "X5");
	        car1.put("color", "Red");
	        car1.put("year", 2021);
	        car1.put("price", 55000);
	        car1.put("electric", false);

        Map<String, Object> car2 = new Hashtable<>();
	        car2.put("brand", "Audi");
	        car2.put("model", "Q7");
	        car2.put("color", "Gray");
	        car2.put("year", 2022);
	        car2.put("price", 50000);
	        car2.put("electric", false);

        Map<String, Object> car3 = new Hashtable<>();
	        car3.put("brand", "Tesla");
	        car3.put("model", "Model Y");
	        car3.put("color", "White");
	        car3.put("year", 2020);
	        car3.put("price", 60000);
	        car3.put("electric", true);

        (Create 3 more map objects and store 3 different car information in them)

        4.1 Create a map named myCars that takes car number as a key and car info as a value
        		Hint: key of the map need to be integer and value of the map need to be a map with String as key and Object as value

		4.2 Display the brand-model-price of each car

		4.3 Display all the electric cars

		4.4 Display the most expensive car

 */