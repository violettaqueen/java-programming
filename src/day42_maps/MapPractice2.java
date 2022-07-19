package day42_maps;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class MapPractice2 {

    public static void main(String[] args) {

        Map<String, Object> person1 = new LinkedHashMap<>();
        person1.put("name", "Arthur"); // first pair
        person1.put("gender", 'M');
        person1.put("age", 32); // reference to an integer object
        person1.put("job_title", "Developer");
        person1.put("salary", 120000);
        person1.put("hired_date", LocalDate.of(2021, 1,12));
        person1.put("married", true);

        System.out.println(person1);

        Map<String, Object> person2 = new LinkedHashMap<>();
        person2.put("name", "Violetta"); // first pair
        person2.put("gender", 'F');
        person2.put("age", 37); // reference to an integer object
        person2.put("job_title", "Developer");
        person2.put("salary", 150000);
        person2.put("hired_date", LocalDate.of(2023, 1,12));
        person2.put("married", true);

        System.out.println(person2.get("name"));

        System.out.println(person2.get("job_title"));  // give valuable keys. It is used like an index number

        Map<String, Object> person3 = new LinkedHashMap<>();
        Map<String, Object> person4 = new LinkedHashMap<>();
        Map<String, Object> person5 = new LinkedHashMap<>();

        List<Map<String, Object>> listOfMaps = new ArrayList<>();
        listOfMaps.add(person1);
        listOfMaps.add(person2);

        // to iterate a list of maps --> to retrieve maps:

        for (Map<String, Object> eachMap : listOfMaps) {
            System.out.println(eachMap);
        }
    }
}
