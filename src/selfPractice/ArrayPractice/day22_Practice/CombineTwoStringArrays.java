package selfPractice.ArrayPractice.day22_Practice;

import java.util.ArrayList;
import java.util.Arrays;

public class CombineTwoStringArrays {

    public static ArrayList<String> combineTwoArrays(String[] arr1, String[] arr2){

        ArrayList<String> list = new ArrayList<>(Arrays.asList(Arrays.toString(arr1)));
        list.add(Arrays.toString(arr2));
        return list;
    }

    public static void main(String[] args) {

      String[]  arr1 = {"A", "B", "C"};
      String []  arr2 = {"D", "E", "F", "G"};

        System.out.println(combineTwoArrays(arr1, arr2));
    }
}
