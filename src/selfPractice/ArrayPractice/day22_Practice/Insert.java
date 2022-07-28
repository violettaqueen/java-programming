package selfPractice.ArrayPractice.day22_Practice;

import java.util.Arrays;

public class Insert {

    public static int[] insert (int[]array, int index, int element){

        int[] newArray = new int[array.length+1];

        for (int i = 0; i < array.length; i++) {


                if (i == index) {
                    newArray[i] = element;
                    newArray[i+1] = array[i];
                }else{
                    if(newArray[i] != 0){
                        newArray[i+1] = array[i];
                    }else{
                        newArray[i] = array[i];
                    }
                }
            }

        return newArray;
    }
    public static double[] insert(double[] array, int index, double element){

        double [] newArray = new double[array.length+1];

        for (int i = 0; i < array.length; i++) {
             if(i == index){
                 newArray[i] = element;
                 newArray[i+1] = array[i];
             } else if (newArray[i] != 0) {
                 newArray[i+1] = array[i];
             }else{
                 newArray[i] = array[i];
             }
        }
        return newArray;
    }
    public static char[] insert(char[]array, int index, char element){

        char [] arr = new char[array.length+1];

        for (int i = 0; i < array.length; i++) {
            if(array[i] == index){
                arr[i] = element;
                arr[i+1] = array[i];
            } else  {
                if(arr[i] != 0){
                    arr[i+1] = array[i];
                }else{
                    arr[i] = array[i];
                }
            }
        }
        return arr;
    }
    public static String [] insert(String[] array, int index, String element){

        String[] result = new String[array.length+1];

        for (int i = 0; i < array.length; i++) {
            if(i == index){
                result[i] = element;
                result[i+1] = array[i];
            }else{
                if(result[i] != null){
                    result[i+1] = array[i];
                }else {
                    result[i] = array[i];
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {

       double[] arr = {10.6, 20.9, 30.1, 40, 50};

       double[] newArray = insert(arr, 2, 100);
        System.out.println(Arrays.toString(newArray));
    }
}
/*
 Insert Task:
        1.1 Create a method named insert that passes three parameters: integer array, integer index,
         integer element. the method inserts the given element to the given index of the array and returns
          the new array
                Ex:
                    arr = {10, 20, 30, 40, 50};

                    insert(arr, 2, 100) ==> {10, 20, 100, 30, 40, 50}


        1.2 Create the same function for double array, char array and string array
 */