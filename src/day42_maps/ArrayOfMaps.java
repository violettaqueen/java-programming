package day42_maps;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;

public class ArrayOfMaps {

    public static void main(String[] args) {

        Map<String, Object> person1 = new LinkedHashMap<>();
        person1.put("name", "Arthur"); // first pair
        person1.put("gender", 'M');
        person1.put("age", 32); // reference to an integer object
        person1.put("job_title", "Developer");
        person1.put("salary", 120000);
        person1.put("hired_date", LocalDate.of(2021, 1,12));
        person1.put("married", true);


        Map<String, Object> person2 = new LinkedHashMap<>();
        person2.put("name", "Violetta"); // first pair
        person2.put("gender", 'F');
        person2.put("age", 37); // reference to an integer object
        person2.put("job_title", "Developer");
        person2.put("salary", 150000);
        person2.put("hired_date", LocalDate.of(2023, 1,12));
        person2.put("married", true);


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

        // creating array, datatype - Map, key - string, value - objects

        Map<String, Object> [] arrayOfMap = new Map[5]; // index: 0 ~ 4

        arrayOfMap[0] = person1;
        arrayOfMap[1] = person2;
        arrayOfMap[2] = person3;
        arrayOfMap[3] = person4;
        arrayOfMap[4] = person5;



        // increase salary:
        arrayOfMap[1].replace("salary", ( (Integer)arrayOfMap[1].get("salary") ) + 10000);

        System.out.println(Arrays.asList(arrayOfMap[1]));

        System.out.println("----------------------------------------------------------------------------------------");

        // to compare the salary:

        int count = 0;


    }
}
