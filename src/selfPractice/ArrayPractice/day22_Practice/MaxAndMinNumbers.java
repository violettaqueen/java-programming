package selfPractice.ArrayPractice.day22_Practice;

import selfPractice.ArrayListPractice.ArrayListMaxAndMinNumbers;

import java.util.ArrayList;
import java.util.Arrays;

public class MaxAndMinNumbers {


    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
            int max = list.get(0);
            int min = list.get(0);

            for (Integer each : list) {
                if (each > max) {
                    max = each;
                }
                if(each < min){
                    min = each;
                }
            }
        System.out.println("max = " + max);
        System.out.println("min = " + min);

        }


}
