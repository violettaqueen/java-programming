package selfPractice.ArrayListPractice.day24_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class SecondMaxMinNumbers {

    public static void secondMinMaxNumber(ArrayList<Integer> list){

        list.removeIf(p -> p == Collections.max(list) || p == Collections.min(list));
        System.out.println("Second maximum number is: " + Collections.max(list));
        System.out.println("Second minimum number is: " + Collections.min(list));
    }

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1, 1, -2, -2, -2, 3, 4, 5, 6, 7, 8, 8, 8, 8));
        System.out.println("Second maximum number is: " + Collections.max(list));
        System.out.println("Second minimum number is: " + Collections.min(list));
    }
}
/*
5. Write a program that can display the second maximum and minimum numbers from an arraylist of integers
		ex:
			list = {1, 1, -2, -2, -2, 3, 4, 5, 6, 7, 8, 8, 8, 8}

		output:
			second maximum number is 7
			second minimum number is 1

	Note: DO NOT use any loops

 */