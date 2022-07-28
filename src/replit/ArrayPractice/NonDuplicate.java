package replit.ArrayPractice;

import java.util.ArrayList;
import java.util.Arrays;

public class NonDuplicate {

    public static void main(String[] args) {

        int[] nums = {1, 2, 3, 4, 3, 4, 1};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 3, 4, 1));

        int nonDup = 0;

        for (int i = 0; i < list.size(); i++) {
            if(list.indexOf(i) != list.lastIndexOf(i)){

                nonDup = list.indexOf(i);
            }
        }
        System.out.println(nonDup);
    }
}