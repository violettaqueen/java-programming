package selfPractice.map;

import java.util.*;

public class mapOfList {

    public static void main(String[] args) {

        List<String> group1 = new ArrayList<>(Arrays.asList("Duygu", "Magda", "Farangez", "Edison", "Kerem", "Farangis"));

        List<String> group2 = new ArrayList<>(Arrays.asList("Margie", "Vesele", "Iryn", "Nilufar", "Aziza", "Nurcan", "Raika", "Igor", "Elif", "Sana", "Azamat"));

        List<String> group9 = new ArrayList<>(Arrays.asList("Alex", "Ali", "Andriy", "Cassandra", "Sevgul", "Olha", "Tito", "Ozan", "Serkan", "Furkan", "Madina", "Muharrem"));

        List<String> group24 = new ArrayList<>(Arrays.asList("Maria", "Kristina", "Amin", "George", "Layan", "Amin", "Yulia", "George", "Ayanle", "Maxim", "Nermin", "Doughlas"));

        List<String> group5 = new ArrayList<>(Arrays.asList("Nazar", "Veronika", "Mikael", "Layla", "Badmaa", "Zaeir", "Anna", "Tamara", "Eugene"));

        // 3.1 Create map that has integer as keys and List of Strings as values.
        //        	add the group number and students name of that group as a pair to the map

        Map<Integer, List<String>> groups = new TreeMap<>();
        groups.put(1,group1);
        groups.put(2,group2);
        groups.put(9,group9);
        groups.put(24,group24);
        groups.put(5,group5);

        // 3.2 Write a program that can display student names of each group in 5 separate lines

        for (Map.Entry<Integer, List<String>> eachGroup : groups.entrySet()) {
            System.out.println(eachGroup.getKey() + " : " + eachGroup.getValue());
        }



    }
}
/*
Given the following lists that conatin the names of the students from each group:
		List<String> group1 = new ArrayList<>(Arrays.asList( "Duygu","Magda","Farangez","Edison","Kerem","Farangis" ));

        List<String> group2 = new ArrayList<>(Arrays.asList( "Margie","Vesele","Iryn","Nilufar","Aziza","Nurcan","Raika","Igor","Elif","Sana","Azamat" ));

        List<String> group9 = new ArrayList<>(Arrays.asList( "Alex","Ali","Andriy","Cassandra","Sevgul","Olha","Tito","Ozan","Serkan","Furkan","Madina","Muharrem" ));

        List<String> group24 = new ArrayList<>(Arrays.asList( "Maria","Kristina","Amin","George","Layan","Amin","Yulia","George","Ayanle","Maxim","Nermin","Doughlas" ));

        List<String> group5 = new ArrayList<>(Arrays.asList("Nazar","Veronika","Mikael","Layla","Badmaa","Zaeir","Anna","Tamara","Eugene" ));


        3.1 Create map that has interger as keys and List of Strings as values.
        	add the group number and students name of that group as a pair to the map

    	3.2 Write a program that can display student names of the each group in 5 seperate lines
 */