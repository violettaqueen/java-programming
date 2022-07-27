package replit.ArrayPractice;

import java.util.ArrayList;
import java.util.Collections;

public class AddInsert {

    public static void main(String[] args) {

        ArrayList<String> words = new ArrayList<>();

        words.add("app");
        words.add("downtown");
        words.add("raining");

       // words.add("hey");
       // words.add("yo");

        words.add(0, "hey");
        words.add(3, "yo");

        System.out.println(words);





    }
    public static void combineAL(Integer numbersOne, Integer numbersTwo ){

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(numbersOne);
        numbers.add(numbersTwo);
        System.out.println(numbers);
    }



}
