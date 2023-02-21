package selfPractice.Different;

import org.w3c.dom.ls.LSOutput;
import utilities.ArraysUtility;

import java.util.Arrays;

public class Math {

    public static void main(String[] args) {

        int num = 2;
        int times= 0;

        for (int i = 1; i <= 10 ; i++) {
//            System.out.print(num);
//            System.out.print(" * ");
//            System.out.print(i);
//            System.out.print(" = ");
//            System.out.print(num * i);
//            System.out.println();
            System.out.println(num + " * " + i + " = " + num * i);
            }
        int[] array = new int[]{1,2,3,4,5};
        System.out.println((Arrays.toString(ArraysUtility.reverse(array))));
    }


    }

