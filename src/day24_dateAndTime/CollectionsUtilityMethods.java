package day24_dateAndTime;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CollectionsUtilityMethods {

    public static void main(String[] args) {

        // replace all ()

        ArrayList<String> names = new ArrayList<>();

        names.addAll(Arrays.asList("Java", "Java", "Java", "C#", "C#", "Ruby", "Swift", "Swift", "Java"));

        System.out.println(names);

        // for case sensetivity loop is better
        for (int i = 0; i < names.size(); i++) {
            if(names.get(i).equals("Java")){
                names.set(i, "Python");
            }
        }



         // provide list and 2 arguments: old argument: Java, new value: Python
        Collections.replaceAll(names, "Java", "Python");

        System.out.println(names);

        System.out.println("--------------------------------------------------------------------");

        ArrayList<Integer>list = new ArrayList<>();
        list.addAll(Arrays.asList(10, 20,20,30, 40,40,50,50,50,50,50,50,60,60,50,50));

        int count = Collections.frequency(list, 50); //return type integer
        System.out.println(count);

        System.out.println("------------------------------------------------------------------------");

        ArrayList<String> words = new ArrayList<>();

        words.addAll(Arrays.asList("Java", "Java", "Java", "C#", "C#", "Ruby", "Swift", "Swift", "Java"));

        int countWord = Collections.frequency(words, "Java");
        System.out.println(countWord);

        System.out.println("------------------------------------------------------------------------");

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.addAll(Arrays.asList(10, 20,20,30, 40,40,50,50,50,50,50,50,60,60,50,50));
                                      // looking for 30 - the number that appears once
        for (Integer each : numbers) {
            if(Collections.frequency(numbers, each) == 1){
                System.out.println(each);
            }
        }


    }


}
