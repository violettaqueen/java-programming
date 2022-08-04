package mentor_Sessions.map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class MapPractice {

    public static void main(String[] args) {

        // creating map:

        Map<String, Integer> hashMap1 = new HashMap<>();
        hashMap1.put("Jon", 110000);
        hashMap1.put(null, 95000);
        hashMap1.put("Sara", null);
        hashMap1.put("Elizabeth", 150000);

        System.out.println(hashMap1.size());
        System.out.println(hashMap1.get("Jon")); // returns value
        System.out.println(hashMap1.replace("Jon", 130000));
        System.out.println(hashMap1.remove("Jon")); // removes key and value
        System.out.println(hashMap1);

        Map<String, Object> person1 = new LinkedHashMap<>();
        person1.put("name", "Arthur");
        person1.put("gender", 'M');
        person1.put("age", 32);
        person1.put("job_title", "Developer");
        person1.put("salary", 120000);
        person1.put("married", true);

        // access to each set

        for (Map.Entry<String, Integer> eachSet : hashMap1.entrySet()) {
            System.out.println(eachSet);
        }
        for (String eachKey : hashMap1.keySet()) {
            System.out.println(eachKey);
        }
        for (Integer eachValue : hashMap1.values()) {
            System.out.println(eachValue);
        }

        Map<Integer, Double> series1 = new LinkedHashMap<>();
        series1.put(1, 1.0);

    }
}
