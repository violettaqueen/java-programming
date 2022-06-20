package selfPractice.ArrayPractice;

import java.util.ArrayList;
import java.util.Arrays;

public class CombineTwoArrays2 {
    public static void main(String[] args) {


        String[] arr1 = {"A", "B", "C"};
        String[] arr2 = {"D", "E", "F", "G"};

        String[][] array2D = new String[2][];

        array2D[0] = arr1;
        array2D[1] = arr2;

        for (int i = 0; i < array2D.length -1; i++) {

        }
        System.out.println(Arrays.toString(array2D));

        System.out.println("---------------------------------------------------------------");

        ArrayList<String> list2 = new ArrayList<>();

        String array1[] = {"A", "B", "C"};
        String array2[] = {"D", "E", "F", "G"};

        for (String each : array1) {
            list2.add(each);
        }
        for (String each : array2) {
            list2.add(each);
        }
        System.out.println("list ==> " + list2);






        }

    }
/*
 write a program that can combine two String arrays into one arrayList
	            ex:
	                arr1 = {"A", "B", "C"};
	                arr2 = {"D", "E", "F", "G"};

                output:
	                list ==> {"A", "B", "C", "D", "E", "F", "G"}
 */