package day23_arrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayArrayListConversion {

    public static void main(String[] args) {

        // convert Array to ArrayList:

        String[] arr = {"A", "B", "C", "D"}; // data type should be non - primitive

        ArrayList<String> list = new ArrayList<>( Arrays.asList(arr) );

        System.out.println(list);


        System.out.println("------------------------------------------------------");

        // how to convert ArrayList to Array:


        ArrayList<String> list2 = new ArrayList<>( Arrays.asList("Java", "Python", "C#") );

        String[] languages = list2.toArray(new String[0]); // required to specify the size. Always give 0 --> it's temporary number

        // String [] languages = list2. toArray(new String [list2.size()]);

        System.out.println(Arrays.toString(languages));

        System.out.println("------------------------------------------------------");

        ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7));

        // ArrayList to Array:
        Integer[] n = nums.toArray(new Integer[0]);
        //   int[] n = nums.toArray(new Integer[0]);  --> compile error!

        System.out.println(Arrays.toString(n));



    }

}
