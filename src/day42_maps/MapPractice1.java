package day42_maps;

import java.util.HashMap;
import java.util.Map;

public class MapPractice1 {

    public static void main(String[] args) {

        Map<String, String> employeeMap = new HashMap<>();

        employeeMap.put("Ddene", "F");
        employeeMap.put("Winfred", "M");
        employeeMap.put("Jereme", "M");
        employeeMap.put("Glad", "F");
        employeeMap.put("Desirae", "F");
        employeeMap.put("Kakalina", "F");
        employeeMap.put("Bertrando", "M");
        employeeMap.put("Ajay", "F");
        employeeMap.put("Brigitte", "F");
        employeeMap.put("Derk", "M");
        employeeMap.put("Orlando", "M");
        employeeMap.put("Selle", "F");
        employeeMap.put("Marika", "F");

        System.out.println("---------------------------------------------------------------------------------------");

        // iterate this map : how many female and male employees in the map

        int countMaleEmployees = 0;
        int countFemaleEmployees = 0;

        for (String eachValue : employeeMap.values()) {
            if (eachValue.equals("F")) {
                countFemaleEmployees++;
            } else {
                countMaleEmployees++;
            }
        }

        System.out.println("Female employees = " + countFemaleEmployees);
        System.out.println("Male employees = " + countMaleEmployees);

        System.out.println("----------------------------------------------------------------------------------------");

        // display the names of all female employees:

        for (String eachName : employeeMap.keySet()) {

        }

        // iterate by entry:

        for (Map.Entry<String, String> eachEntry : employeeMap.entrySet()) {
            if(eachEntry.getValue().equals("F")){
                System.out.println(eachEntry.getKey());
            }
        }
        System.out.println("----------------------------------------------------------------------------------------");

        // update all the "M" values with "F":

        for (Map.Entry<String, String> eachEntry : employeeMap.entrySet()) {
            if (eachEntry.getValue().equals("M")){
                eachEntry.setValue("Male");
        }else{
                eachEntry.setValue("Female");
            }

        }
        System.out.println(employeeMap);
    }
}
