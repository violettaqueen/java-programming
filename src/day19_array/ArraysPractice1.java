package day19_array;

import java.util.Arrays;

public class ArraysPractice1 {

    public static void main(String[] args) {

        String[]myGroup = new String[5];

        myGroup[0] = "Gulchin";
        myGroup[myGroup.length-1] = "Aseel";
        myGroup[2] = "Violetta";
        myGroup[1] = "Nathan";
        myGroup[3] = "Elizabeth";

        System.out.println(Arrays.toString(myGroup));

        myGroup[0]= "Brylee";

        System.out.println(Arrays.toString(myGroup));

        System.out.println("----------------------------------------------------------------");

        // print names in reverse order
        for (int i = myGroup.length-1; i >= 0 ; i--) {
            System.out.println(myGroup[i]);
        }
        System.out.println("-----------------------------------------------------------------");



    }

}
