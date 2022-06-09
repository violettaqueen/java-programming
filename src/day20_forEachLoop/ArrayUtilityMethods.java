package day20_forEachLoop;

import java.util.Arrays;

public class ArrayUtilityMethods {

    public static void main(String[] args) {

        int[] score = {70, 100, 80, 90, 65};
        System.out.println(Arrays.toString(score)); // returns a String value

        String result = Arrays.toString(score);

        System.out.println("------------------------------------------------------------------");

        int[] a1 = {1,2,3,4,5};
        int[] a2 = {1,2,3,4,5};

        boolean r1 = Arrays.equals(a1,a2);
        System.out.println(r1);

        char[] ch1 = {'A', 'B', 'C'};
        char[] ch2 = {'A', 'C', 'B'};

        boolean r2 = Arrays.equals(ch1,ch2);

        System.out.println(r2);

        String[] s1 = {"A", "B", "C"};
        String[] s2 = {"A", "C", "B"};

        System.out.println(Arrays.equals(s1,s2));

        System.out.println("---------------------------------------------------------------------------");

        int[] numbers = {100, 80, 90, 75, 88, 99, 0, 5, 4, 1000, 500};

        System.out.println(Arrays.toString(numbers));

        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));

        //how to get a minimum number
        System.out.println("Minimum number: " + numbers[0]); // first index number
        System.out.println("Maximum number: " + numbers[numbers.length-1]);

        System.out.println("----------------------------------------------------------------------------");

        String[] b1 = {"A", "B", "C"};
        String[] b2 = {"A", "C", "B"};

        Arrays.sort(b1); //b1 = {A, B, C}
        Arrays.sort(b2); //b2 = {A, B, C}

        System.out.println(Arrays.equals(b1,b2));

        System.out.println("---------------------------------------------------------------------------");

        String[] students = {"Violetta", "Vlad", "Nathan", "Jon"}; //it sorts in Alphabet order

        Arrays.sort(students);
        System.out.println(Arrays.toString(students));

        System.out.println("-------------------------------------------------------------------------------");

        int[] array = {10, 20, 30, 40, 50, 60, 70};
        int[] array2 = Arrays.copyOf(array, 5); // number shows how many numbers to copy

        System.out.println(Arrays.toString(array2));

        System.out.println("----------------------------------------------------------------------------------");

        int[] n1 = {1,2,3,4,5,6};
        int[] n2 = {6,7,8,9,10, 11,12};

        int[] n3 = Arrays.copyOf(n1, n1.length + n2.length );

        for (int i = 0, j = n1.length; i < n2.length; i++, j++){
            n3[j] = n2[i];
        }
        System.out.println(Arrays.toString(n3));

        System.out.println("------------------------------------------------------------------------------------");

        char[] ch ={'A', 'B', 'C', 'D', 'E', 'F', 'G'};
        // index:    0     1    2   3    4    5    6
        char[] result1 = Arrays.copyOf(ch,4 ); // start to copy start from first element
        System.out.println(Arrays.toString(result1));

        char[] result2 = Arrays.copyOfRange(ch,2, 4); // it doesn't include index 4, (last index)
        System.out.println(Arrays.toString(result2));

        char[] result3 = Arrays.copyOfRange(ch, 2, ch.length ); // to print from index 2 to last index
        System.out.println(Arrays.toString(result3));



    }

}
