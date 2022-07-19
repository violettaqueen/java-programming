package day42_maps;

import java.time.LocalDate;
import java.util.*;


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
        person3.put("name", "Elizabeth");
        person3.put("gender", "F");
        person3.put("age", 21);
        person3.put("job_title", "Developer");
        person3.put("salary", 120000);
        person3.put("hired_dates", LocalDate.of(2022,1,15));
        person3.put("married", false);

        Map<String, Object> person4 = new LinkedHashMap<>();
        person4.put("name", "Jon");
        person4.put("gender", "M");
        person4.put("age", 43);
        person4.put("job_title", "Developer");
        person4.put("salary", 160000);
        person4.put("hired_dates", LocalDate.of(2021,1,15));
        person4.put("married", false);
        
        Map<String, Object> person5 = new LinkedHashMap<>();
        person5.put("name", "Nathan");
        person5.put("gender", "M");
        person5.put("age", 29);
        person5.put("job_title", "Developer");
        person5.put("salary", 120000);
        person5.put("hired_dates", LocalDate.of(2022,1,15));
        person5.put("married", true);

        List<Map<String, Object>> listOfMaps = new ArrayList<>();
        listOfMaps.add(person1);
        listOfMaps.add(person2);
        listOfMaps.add(person3);
        listOfMaps.add(person4);
        listOfMaps.add(person5);

        // to iterate a list of maps --> to retrieve maps:

        for (Map<String, Object> eachMap : listOfMaps) {
            System.out.println(eachMap);
            for (Map.Entry<String, Object> eachEntry : eachMap.entrySet()) {
                System.out.println(eachEntry);
            }
        }
        System.out.println("-----------------------------------------------------------------------");

        // display the names of the employee who are hired this year (2022)

        for (Map<String, Object> eachMap : listOfMaps) {
            for (Map.Entry<String, Object> eachEntry : eachMap.entrySet()) {
                if (eachEntry.getKey().equals("hired_date")){
                   if( ( (LocalDate)eachEntry.getValue() ).getYear() == 2022){
                       System.out.println(eachMap.get("name"));
                   }
                }
            }
        }
        System.out.println("----------------------------------------------------------------------------");

        listOfMaps.get(0).replace("name", "Vasil");

        // to update the salary of last person in the list:
        listOfMaps.get(listOfMaps.size()-1).replace("salary",( (Integer)listOfMaps.get(listOfMaps.size()-1).get("salary")) + 50000 );

        listOfMaps.get(1).replace("age", 27);
        listOfMaps.get(2).replace("age", ( (Integer)listOfMaps.get(2).get("age")) + 4);

        System.out.println(listOfMaps);

        System.out.println("------------------------------------------------------------------------------------------");

        Map<String, Object> car1 = new LinkedHashMap<>();
        car1.put("brand", "BMW");
        car1.put("model", "X5");
        car1.put("year", 2021);
        car1.put("color", "Blue");
        car1.put("price", 65000.5);

        Map<String, Object> car2 = new LinkedHashMap<>();

        Map<String, Object> car3 = new LinkedHashMap<>();

        Map<String, Object> car4 = new LinkedHashMap<>();

        List<Map<String, Object>> cars = new ArrayList<>();
        cars.addAll(Arrays.asList(car1, car2, car3, car4));



    }
}
