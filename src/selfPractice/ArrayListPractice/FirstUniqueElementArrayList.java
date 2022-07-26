package selfPractice.ArrayListPractice;

import utilities.ArrayListUtility;

import java.util.ArrayList;
import java.util.Arrays;

public class FirstUniqueElementArrayList {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1, 1, 2, 3, 3, 4, 5, 5, 6));

        System.out.println(ArrayListUtility.firstUniqueElement(list));

    }
}


