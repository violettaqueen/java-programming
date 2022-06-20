package day24_DateAndTime.day24_PracticeTasks;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListCountryName {

    public static void main(String[] args) {

        ArrayList<String> countryNames = new ArrayList<>(Arrays.asList("Singapore", "New Zealand", "Australia", "Amsterdam", "Lybia", "Ukraine",
                "Bosnia", "USA", "Greece"));
        countryNames.removeIf(p -> p.length() >= 10);
        System.out.println(countryNames);

    }
}
/*
Create an ArrayList of string called country names, write a program that
 can remove all the country names that have length of 10 or greater
 */