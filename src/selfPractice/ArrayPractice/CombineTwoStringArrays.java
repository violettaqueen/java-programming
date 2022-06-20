package selfPractice.ArrayPractice;

import java.io.FilterOutputStream;
import java.util.ArrayList;
import java.util.Arrays;

public class CombineTwoStringArrays {

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();

        String[] arr1 = {"A", "B", "C"};
        String[] arr2 = {"D", "E", "F", "G"};

        for (String each : arr1) { //get all the elements from first
            list.add(each);
        }
        for (String each2 : arr2) {
            list.add(each2);
        }
        System.out.println(list);



    }
}

/*
 write a program that can combine two String arrays into one arrayList
                ex:
                    arr1 = {"A", "B", "C"};
                    arr2 = {"D", "E", "F", "G"};
                    list ==> {"A", "B", "C", "D", "E", "F", "G"}
 */