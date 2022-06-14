package selfPractice;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListPracticeRemoveAll {

    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();

        names.addAll(Arrays.asList("John", "Ahmed", "Daniel", "Ahmed", "James", "Muhammed"));

        names.removeAll(Arrays.asList("Ahmed"));


        System.out.println(names);


    }
}
/*
Write a program that can remove all the names "Ahmed" from an arraylist of String
			ex:
                list = ["John", "Ahmed", "Daniel", "Ahmed", "James", "Muhammed"];

            output:
            	["John", "Daniel", "James", "Muhammed"];
 */