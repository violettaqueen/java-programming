package day24_DateAndTime.day24_PracticeTasks;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveIfTask {

    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>(Arrays.asList("Anna", "Canada", "Bob", "David", "Lan", "Abida", "Ebrahim", "Farida"));

        names.removeIf(p -> p.substring(0,1).equalsIgnoreCase(p.substring(p.length()-1)));
        System.out.println(names);
    }

}
/*
Write a program that can remove string elements from an arraylist if the first and last characters of the string are same
	ex:
		list = {"Anna", "Canada", "Bob", "David", "Lan", "Abida", "Ebrahim", "Farida"}

	output:
		["Lan", "Ebrahim", "Farida"]
 */