package selfPractice.map;

import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;

public class StudentMap {

    public static void main(String[] args) {

        Map<String, Integer[]> studentScore = new TreeMap<>();

        studentScore.put("Violetta", new Integer[] {90,89,79,98,100});
        studentScore.put("Svetlana", new Integer[] {78,99,97,87,80});
        studentScore.put("Jon", new Integer[] {89,90,90,100,100});
        studentScore.put("Elizabeth", new Integer[]{100,100,99,97,79});
        studentScore.put("Olga", new Integer[] {100,90,87,78,99});

        for (Map.Entry<String, Integer[]> eachStudent : studentScore.entrySet()) {
            System.out.println(eachStudent.getKey() + " : " + Arrays.asList(eachStudent.getValue()));
        }






    }
}
/*
 Create a map that can contain the student name (String) and student scores (int[]) as a pair (Assume
  that each student has 5 scores and make the
 student name unique)
		1.1 add at least 5 paris into the map
		1.2 Write a program that can display each student name and scores
 */