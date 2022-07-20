package selfPractice.map;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

public class MapOfEmployees {

    public static void main(String[] args) {

        Map<String, Integer> map = new LinkedHashMap<>();
        map.put("John", 123000);
        map.put("Antony", 100000);
        map.put("Jimmy", 115000);
        map.put("Jalil", 145000);
        map.put("James", 110000);
        map.put("Conor", 85000);
        map.put("Josh", 117000);
        map.put("Cory", 118000);
        map.put("Anderson", 125000);
        map.put("Steven", 135000);

        // find max and min salary:

        int maxSalary = Collections.max(map.values());
        int minSalary = Collections.min(map.values());

        // 2.1 who has the maximum and minimum salary? Display name and salary:

        for (Map.Entry<String, Integer> eachEmployeeEntry : map.entrySet()) {
            if (eachEmployeeEntry.getValue().equals(maxSalary)) {
                System.out.print(eachEmployeeEntry.getKey() + " : " + eachEmployeeEntry.getValue());
                System.out.println();
            } else if (eachEmployeeEntry.getValue().equals(minSalary)) {
                System.out.println(eachEmployeeEntry.getKey() + " : " + eachEmployeeEntry.getValue());
            }
        }

        // how many employees has the salary between 120k ~ 150K? Display number:
        int between120_150K = 0;
        for (Map.Entry<String, Integer> eachEmployeeEntry : map.entrySet()) {
            if (eachEmployeeEntry.getValue() < 150000 && eachEmployeeEntry.getValue() > 120000) {
                between120_150K ++;
            }
        }
        System.out.println(between120_150K);

        // display the names of the employees who are making less than 118k?

        for (Map.Entry<String, Integer> eachEmployeeEntry : map.entrySet()) {
            if(eachEmployeeEntry.getValue() < 118000){
                System.out.println(eachEmployeeEntry.getKey());
            }
        }
        // 2.4 increase the salary employee by 10K if the current salary of employee is less than 120K

        int newSalary = 0;
        for (Map.Entry<String, Integer> eachEmployeeEntry : map.entrySet()) {
            if(eachEmployeeEntry.getValue()< 120000){
                eachEmployeeEntry.setValue(eachEmployeeEntry.getValue() + 10000);
                System.out.println(eachEmployeeEntry.getKey() + " : " + eachEmployeeEntry.getValue());
            }

        }



    }
}
/*
 Given following map that contains employee name and employee salary:
	 Map<String, Integer> map = new LinkedHashMap<>();
        map.put("John", 123000);
        map.put("Antony", 100000);
        map.put("Jimmy", 115000);
        map.put("Jalil", 145000);
        map.put("James", 110000);
        map.put("Conor", 85000);
        map.put("Josh", 117000);
        map.put("Cory", 118000);
        map.put("Anderson",125000);
        map.put("Steven", 135000);

    2.1 who has the maximum and minimum salary?

    2.2 how many employees has the salary between 120k ~ 150K?

    2.3 display the names of the employees who are making less than 118k?

    2.4 increase the salary employee by 10K if the current salary of employee is less than 120K
 */