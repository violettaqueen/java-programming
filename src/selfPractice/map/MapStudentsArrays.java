package selfPractice.map;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;

public class MapStudentsArrays {

    public static void main(String[] args) {

        String[] group1 = {"Violetta", "Jon", "Lizzy", "Kate", "Nate"};
        String[] group2 = {"Michael", "Alexander", "Nataly", "Inna", "Lina"};
        String[] group3 = {"Hazar", "Roxana", "Valery", "Zoya", "Leo"};
        String[] group4 = {"Shukur", "Entisar", "Kadifa", "Baha", "Kramer"};
        String[] group5 = {"Yelena", "Keith", "Marina", "Liana", "Cesar"};

        // 4.1 Create a map that contains group id and names of group members

        Map<Integer, String[]> groups = new LinkedHashMap<>();
        groups.put(1, group1);
        groups.put(2, group2);
        groups.put(3, group3);
        groups.put(4, group4);
        groups.put(5, group5);

        //   4.2 Display the names of each student with group id of 1

        for (Map.Entry<Integer, String[]> eachGroup : groups.entrySet()) {
            if(eachGroup.getKey().equals(1)){
                System.out.println("Group id " + eachGroup.getKey() + " : " +Arrays.asList(eachGroup.getValue()));
            }
        }
        //  4.3 Display the names of each student from each groups

        for (Map.Entry<Integer, String[]> eachGroup : groups.entrySet()) {
            System.out.println(Arrays.asList(eachGroup.getValue()));
        }



    }
}
/*
Given the following arrays that contains the names of the students from each group:
	        String[] group1 = {};
	        String[] group2 = {};
	        String[] group3 = {};
	        String[] group4 = {};
	        String[] group5 = {};

	    4.1 Create a map that contains group id and names of group members

	            Map<Integer, String[]> groups = new LinkedHashMap();

	        add all the group 1d and group members into the map named groups

	    4.2 Display the names of each student with group id of 1

	    4.3 Display the names of each student from each groups

 */