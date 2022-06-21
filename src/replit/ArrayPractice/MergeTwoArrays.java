package replit.ArrayPractice;

import java.util.Arrays;

public class MergeTwoArrays {

    public static void main(String[] args) {

        int[] a1 = {10, 20, 30, 40, 50};
        int[] a2 = {60, 70, 80, 90, 100, 110, 120};

        int[] mergedArrays = new int [a1.length + a2.length];

        int k = 0;

        for (int each : a1){
            mergedArrays [k++] = each;
        }
        for (int each : a2) {
            mergedArrays [k++] = each;

        }

        System.out.println(Arrays.toString(mergedArrays));


    }

}
/*
mergR merges two arrays into one. It gets two int arrays and returns an int array

Example:

mergR([1,2,3],[4,5,6])

returns [1,2,3,4,5,6]
mergR([1,2],[6,8])

returns [1,2,6,8]
hint:

create a length int for the combined length of both arrays.
create an array with that length (that is the array we will return).
create an iterator for both arrays (int z=0).
loop first array and inside the loop insert current element to the return array (ret[z]=a[i];)
then increment the iterator for both arrays (z++).
do the same for the second array.
 */