package day19_array;

import java.util.Arrays;

public class ArrayLiterals {

    public static void main(String[] args) {

        int[] numbers = new int[5];

        int[] nums = {1,2,3,4,5}; //Array literals

        System.out.println(numbers.length);
        System.out.println(nums.length);

        System.out.println("numbers = " + Arrays.toString(numbers));
        System.out.println("nums = " + Arrays.toString(nums));

        System.out.println("---------------------------------------------------------------");
        // element:       1          2         3            4           5          6            7
        String[]days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        // index:        0          1           2            3          4          5           6
        int n =1; // number of element
        System.out.println(days [n-1]); //convert index number by yourself

        System.out.println("------------------------------------------------------------------");

        String[] months = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};

        System.out.println("month = " + Arrays.toString(months));

        System.out.println("---------------------------------------------------------------------");

        for (int i = months.length - 1; i >= 0; i--) {
            System.out.println(months[i]);
        }

        }
    }


