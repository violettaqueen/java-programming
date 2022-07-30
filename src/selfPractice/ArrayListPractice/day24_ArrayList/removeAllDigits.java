package selfPractice.ArrayListPractice.day24_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class removeAllDigits {

    public static ArrayList<Character> removeAllDigits(ArrayList<Character> list){
        list.removeIf(p -> Character.isDigit(p));
        return list;
    }

    public static void main(String[] args) {
         ArrayList<Character> list = new ArrayList<>(Arrays.asList('$','A', 'B', '1', '2', 'C', 'D', '@', '!', '3', '4'));
        System.out.println(removeAllDigits(list));
    }
}
/*
2. Write a program that can remove all the digits from an arraylist of characters
		ex:
			list = {'$', A', 'B', '1', '2', 'C', 'D', '@', '!', '3', '4'}

		output:
			['$', A', 'B', 'C', 'D', '@', '!']

	Note: DO NOT use any loops
 */