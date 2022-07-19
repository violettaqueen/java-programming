package day42_maps;

import java.sql.SQLOutput;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class IteratingMap {

    public static void main(String[] args) {

        Map<String, Integer> map = new LinkedHashMap<>();  // random order, both key and value doesn't accept null, Synchronized

        map.put("Daniel", 95000);
        map.put("Emily", 100000);
        map.put("Bella", 85000);
        map.put("Aaron", 78000);
        map.put("Violetta", 150000);

        // Iterating the map by the keys
        // + doubling the salary:

        for (String eachKey : map.keySet()) {
            map.replace(eachKey, map.get(eachKey) * 2); // current value use get ()

        }
        System.out.println(map);

        System.out.println("-------------------------------------------------------------------------------------");

        // iterate map by VALUES:

        for (Integer eachValue : map.values()) {
            System.out.println(eachValue);
        }

        System.out.println("----------------------------------------------------------------------------------");

        // Iterate map by ENTRIES:

        for (Map.Entry<String, Integer> eachEntry : map.entrySet()) {// Entry interface, call it through the Map
            System.out.println(eachEntry);
        }
        System.out.println("--------------------------------------------------------------------------------------");

        for (Map.Entry<String, Integer> eachEntry : map.entrySet()) {
            String eachKey = eachEntry.getKey();
            Integer eachValue = eachEntry.getValue();
            eachEntry.setValue(eachValue + 10000);
            System.out.println(eachKey + " : " + eachValue);
        }
        System.out.println(map);

    }
}
