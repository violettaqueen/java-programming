package lab_days.lab13_collection_map;

import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map;

public class MapPractice {

    public static void main(String[] args) {

        Map<String, Object> car7 = new LinkedHashMap<>(); // same order
        car7.put("brand", "BMW");
        car7.put("model", "X6");
        car7.put("body", "SUV");
        car7.put("year", 2023); // autoboxing
        car7.put("autoTransmission", true); // autoboxing
        car7.put("price", 65000);  // autoboxing

        // we have 12 data, 6 pairs, size is measured by pairs

        System.out.println(car7.size());

        // map is mutable, we can update value but not the key, we don't have a method, so we only can remove the key

        car7.put("price", 55000); // it's not going to add this pair because no dup keys BUT compiler will update a VALUE

        // IF I need to get just a brand and model:

        System.out.println(car7.get("brand") + " : " + car7.get("model"));

        // value() - used rarely!

        for (Object eachValue : car7.values()) {
            System.out.println(eachValue);
        }

        // if we need key:

        for (String eachKey : car7.keySet()) {
            System.out.println(eachKey);
        }

        // both key and value:

        for (Map.Entry<String, Object> eachEntry : car7.entrySet()) {
            // System.out.println(eachEntry);
            System.out.println(eachEntry.getValue() + " : " + eachEntry.getKey());
        }

        // set the year to 2019, price to 50000:

        for (Map.Entry<String, Object> eachEntry : car7.entrySet()) {
            if(eachEntry.getKey().equals("year")){
                eachEntry.setValue(2019);
            }
        }
        System.out.println(car7);

        // create multiple map objects:

        Map<Integer, Map<String, Object>> cars = new LinkedHashMap<>();
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

                if (eachEntry.getKey().equals("brand")){
                    System.out.println("brand: " + eachEntry.getValue());
                } else if (eachEntry.getKey().equals("model")) {
                    System.out.println("model: " + eachEntry.getValue());
                }else if (eachEntry.getKey().equals("price")) {
                    System.out.println("price: " + eachEntry.getValue());
                }
            }
        }
        // if I need to change year:

        myCars.get(2).replace("year", 2018);

        // increase price of all cars by 10%:

        for (Map.Entry<Integer, Map<String, Object>> eachCar : myCars.entrySet()) {
            for (Map.Entry<String, Object> eachEntry : eachCar.getValue().entrySet()) {// each of the map
                if(eachEntry.getKey().equals("price")){
                    eachEntry.setValue((Integer)eachEntry.getValue() * 1.1) ; // value is an object, not a number
                }
            }
        }
        System.out.println(myCars);
    }
}
