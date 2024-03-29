package utilities;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArraysUtility {

    public static int[] merge(int[] arr1, int[] arr2) {

        int[] arr3 = new int[arr1.length + arr2.length]; //to make sure that 3d array has enough
        // capacity to contain arr1 and arr2

        int k = 0; // k is for third arrays index numbers

        for (int i = 0; i < arr1.length; i++, k++) { //i: for first arrays index numbers
            arr3[k] = arr1[i];

        }

        for (int i = 0; i < arr2.length; i++, k++) { //i: for second arrays index numbers
            arr3[k] = arr2[i];
        }
        return arr3;
    }

    public static double[] merge(double[] arr1, double[] arr2) {

        double[] arr3 = new double[arr1.length + arr2.length]; //to make sure that 3d array has enough capacity to contain arr1 and arr2

        int k = 0; // k is for third arrays index numbers

        for (int i = 0; i < arr1.length; i++, k++) { //i: for first arrays index numbers
            arr3[k] = arr1[i];

        }

        for (int i = 0; i < arr2.length; i++, k++) { //i: for second arrays index numbers
            arr3[k] = arr2[i];
        }
        return arr3;


    }

    public static char[] merge(char[] arr1, char[] arr2) {

        char[] arr3 = new char[arr1.length + arr2.length]; //to make sure that 3d array has enough capacity to contain arr1 and arr2

        int k = 0; // k is for third arrays index numbers

        for (int i = 0; i < arr1.length; i++, k++) { //i: for first arrays index numbers
            arr3[k] = arr1[i];

        }

        for (int i = 0; i < arr2.length; i++, k++) { //i: for second arrays index numbers
            arr3[k] = arr2[i];
        }
        return arr3;
    }

    public static String[] merge(String[] arr1, String[] arr2) {

        String[] arr3 = new String[arr1.length + arr2.length]; //to make sure that 3d array has enough capacity to contain arr1 and arr2

        int k = 0; // k is for third arrays index numbers

        for (int i = 0; i < arr1.length; i++, k++) { //i: for first arrays index numbers
            arr3[k] = arr1[i];

        }

        for (int i = 0; i < arr2.length; i++, k++) { //i: for second arrays index numbers
            arr3[k] = arr2[i];
        }
        return arr3;
    }

    public static double[] reverse(double[] array) {

        double[] reverse = new double[array.length];


        for (int i = array.length - 1, j = 0; i >= 0; i--, j++) {
            reverse[i] = array[i];
        }
        return reverse;
    }

    public static int[] reverse(int[] array) {

        int[] reverse = new int[array.length];


        for (int i = array.length - 1, j = 0; i >= 0; i--, j++) {
            reverse[j] = array[i];
        }
        return reverse;
    }

    public static char[] reverse(char[] array) {

        char[] reverse = new char[array.length];


        for (int i = array.length - 1, j = 0; i >= 0; i--, j++) {
            reverse[j] = array[i];
        }
        return reverse;
    }

    public static String[] reverse(String[] array) {

        String[] reverse = new String[array.length];


        for (int i = array.length - 1, j = 0; i >= 0; i--, j++) {
            reverse[j] = array[i];
        }
        return reverse;
    }

    public static int[] addElement(int[] array, int element) {
        int[] new_array = Arrays.copyOf(array, array.length + 1);
        new_array[new_array.length - 1] = element;
        return new_array;
    }

    public static double[] addElement(double[] array, double element) {
        double[] new_array = Arrays.copyOf(array, array.length + 1);
        new_array[new_array.length - 1] = element;
        return new_array;
    }

    public static String[] addElement(String[] array, String element) {
        String[] new_array = Arrays.copyOf(array, array.length + 1);
        new_array[new_array.length - 1] = element;
        return new_array;
    }

    public static char[] addElement(char[] array, char element) {
        char[] new_array = Arrays.copyOf(array, array.length + 1);
        new_array[new_array.length - 1] = element;
        return new_array;
    }

    public static boolean contains(int[] array, int element) {

        for (int each : array) {
            if (each == element) {
                return true;
            }

        }
        return false;

    }

    public static boolean contains(char[] array, char element) {

        for (char each : array) {
            if (each == element) {
                return true;
            }

        }
        return false;

    }

    public static boolean contains(String[] array, String element) {

        for (String each : array) {
            if (each.equals(element)) {
                return true;
            }

        }
        return false;

    }

    public static boolean contains(double[] array, double element) {

        for (double each : array) {
            if (each == element) {
                return true;
            }

        }
        return false;

    }

    public static void printUniqueNumbers(int[] nums) {
        for (int element : nums) { // each element of array

            int count = 0;
            for (int each : nums) {
                if(each == element){
                    count ++;
                }
            }
            if(count == 1){
                System.out.println(element);
            }
        }

    }

    public static int countAppearance(String[] arr, String word) {
        int countAppearance = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals(word)) {
                countAppearance += 1;
            }
        }
        return countAppearance;
    }

    public static ArrayList<String> swap(ArrayList<String> list, int pos1, int pos2) {

        Collections.swap(list, pos1, pos2);
        return list;
    }

    public static String reverseSentence(String sentence) {

        String[] sentenceArray = sentence.split(" ");
        String reversedSentence = "";
        for (int i = sentenceArray.length - 1; i >= 0; i--) { // iterate in reverse order
            reversedSentence += sentenceArray[i] + " ";

        }
        return reversedSentence.trim();
    }

    public static String initials(String[] names) {

        String initials = "";
        for (String eachName : names) {
            initials = eachName.charAt(0) + "." + eachName.charAt(eachName.lastIndexOf(" ") + 1);
        }
        return initials;
    }

    public static String reverseSecondWord(String sentence) {

        String[] splitSent = sentence.split(" ");
        String result = "";

        for (int i = 0; i < splitSent.length; i++) {

            if (i == 1) {
                String word = splitSent[i];
                for (int j = word.length() - 1; j >= 0; j--) {
                    result += word.charAt(j);
                }
                result += " ";
            } else {
                result += splitSent[i] + " ";
            }
        }
        return result;
    }

    public static void countEvenOddArray(int[] array) {

        int evenCount = 0;
        int oddCount = 0;

        for (int eachNum : array) {

            if (eachNum % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }
        System.out.println(evenCount);
        System.out.println(oddCount);
    }

    public static String commonElements(int[] arr1, int[] arr2) {

        String common = "";
        for (int each1 : arr1) {
            for (int each2 : arr2) {
                if (each1 == each2) {
                    common += each1 + " ";

                }
            }
        }
        return common;
    }

    public static String uniqueElements(int[] nums) {

        String unique = "";

        for (int element : nums) {

            int count = 0;

            for (int each : nums) {

                if (each == element) {
                    count++;
                }
            }
            if (count == 1) {
                unique += element + " ";
            }
        }
        return unique;
    }

    public static void populateArray(int nums) {

        int[] array = new int[nums];

        for (int i = 0, j = 1; i < array.length; i++, j++) {
            array[i] += j;

        }
        System.out.println(Arrays.toString(array));
    }

    public static int[] replace(int[] array, int index, int newElement) {
        for (int i = 0; i < array.length; i++) {
            if (i == index) {
                array[i] = newElement;
            }
        }
        return array;
    }

    public static double[] replace(double[] array, int index, double newElement) {
        for (int i = 0; i < array.length; i++) {
            if (i == index) {
                array[i] = newElement;
            }
        }
        return array;
    }

    public static String[] replace(String[] array, int index, String newElement) {
        for (int i = 0; i < array.length; i++) {
            if (i == index) {
                array[i] = newElement;
            }
        }
        return array;
    }

    public static char[] replace(char[] array, int index, char newElement) {
        for (int i = 0; i < array.length; i++) {
            if (i == index) {
                array[i] = newElement;
            }
        }
        return array;
    }

    public static int[] removeTheElement(int[] array, int index) {

        int[] newArray = new int[array.length - 1]; // create a new array with the size of one less

        for (int i = 0, j = 0; i < array.length; i++) {
            if (i == index) {
                continue;
            }
            newArray[j++] = array[i];
        }
        return newArray;
    }

    public static double[] removeElement(double[] array, int index) {

        double[] newArray = new double[array.length - 1]; // create a new array with the size of one less

        for (int i = 0, j = 0; i < array.length; i++) {
            if (i == index) {
                continue;
            }
            newArray[j++] = array[i];
        }
        return newArray;
    }

    public static String[] removeElement(String[] array, int index) {

        String[] newArray = new String[array.length - 1]; // create a new array with the size of one less

        for (int i = 0, j = 0; i < array.length; i++) {

            if (i == index) {
                continue;
            }
            newArray[j++] = array[i];
        }
        return newArray;
    }

    public static char[] removeElement(char[] array, int index) {

        char[] newArray = new char[array.length - 1]; // create a new array with the size of one less

        for (int i = 0, j = 0; i < array.length; i++) {
            if (i == index) {
                continue;
            }
            newArray[j++] = array[i];
        }
        return newArray;
    }

    public static int[] replaceAll(int[] array, int oldElement, int newElement) {

        int[] newArray = Arrays.copyOf(array, array.length);

        for (int i = 0; i < array.length; i++) {
            if (array[i] == oldElement) {
                array[i] = newElement;
                newArray[i] = newElement;
            }
        }
        return newArray;
    }

    public static double[] replaceAll(double[] array, double oldElement, double newElement) {

        double[] newArray = Arrays.copyOf(array, array.length);

        for (int i = 0; i < array.length; i++) {
            if (array[i] == oldElement) {
                array[i] = newElement;
                newArray[i] = newElement;
            }
        }
        return newArray;
    }

    public static String[] replaceAll(String[] array, String oldElement, String newElement) {

        String[] newArray = Arrays.copyOf(array, array.length);

        for (int i = 0; i < array.length; i++) {
            if (array[i].equals(oldElement)) {
                array[i] = newElement;
                newArray[i] = newElement;
            }
        }
        return newArray;
    }

    public static char[] replaceAll(char[] array, char oldElement, char newElement) {

        char[] newArray = Arrays.copyOf(array, array.length);

        for (int i = 0; i < array.length; i++) {
            if (array[i] == oldElement) {
                array[i] = newElement;
                newArray[i] = newElement;
            }
        }
        return newArray;

    }

    public static int[] insert(int[] array, int index, int element) {

        int[] newArray = new int[array.length + 1];

        for (int i = 0; i < array.length; i++) {


            if (i == index) {
                newArray[i] = element;
                newArray[i + 1] = array[i];
            } else {
                if (newArray[i] != 0) {
                    newArray[i + 1] = array[i];
                } else {
                    newArray[i] = array[i];
                }
            }
        }

        return newArray;
    }

    public static double[] insert(double[] array, int index, double element) {

        double[] newArray = new double[array.length + 1];

        for (int i = 0; i < array.length; i++) {
            if (i == index) {
                newArray[i] = element;
                newArray[i + 1] = array[i];
            } else if (newArray[i] != 0) {
                newArray[i + 1] = array[i];
            } else {
                newArray[i] = array[i];
            }
        }
        return newArray;
    }

    public static char[] insert(char[] array, int index, char element) {

        char[] arr = new char[array.length + 1];

        for (int i = 0; i < array.length; i++) {
            if (array[i] == index) {
                arr[i] = element;
                arr[i + 1] = array[i];
            } else {
                if (arr[i] != 0) {
                    arr[i + 1] = array[i];
                } else {
                    arr[i] = array[i];
                }
            }
        }
        return arr;
    }

    public static String[] insert(String[] array, int index, String element) {

        String[] result = new String[array.length + 1];

        for (int i = 0; i < array.length; i++) {
            if (i == index) {
                result[i] = element;
                result[i + 1] = array[i];
            } else {
                if (result[i] != null) {
                    result[i + 1] = array[i];
                } else {
                    result[i] = array[i];
                }
            }
        }
        return result;
    }

    public static int[] swap(int[] arr, int i, int j) {

        int temp = arr[i];

        arr[i] = arr[j];
        arr[j] = temp;

        return arr;
    }

    public static double[] swap(double[] arr, int i, int j) {

        double temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;

        return arr;
    }

    public static String[] swap(String[] arr, int i, int j) {

        String temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;

        return arr;
    }

    public static char[] swap(char[] arr, int i, int j) {

        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;

        return arr;
    }

    public static int firstUniqueNumber(int[] nums) {
        int firstUnique = 0;

        for (int element : nums) {
            int count = 0;

            for (int each : nums) {
                if (each == element) {
                    count++;
                }
            }
            if (count == 1) {
                firstUnique = element;
            }
        }
        return firstUnique;
    }

    public static int countDuplicates(String[] array) {

        int getDup = 0;

        for (String element : array) {
            int count = 0;
            for (String each : array) {
                if (each.equals(element)) {
                    count++;
                }
            }
            if (count > 1) {
                getDup++;
            }
        }
        return getDup;
    }

    public static void removeElement(char[] arr) {
    }
}

   /* public static int[] removeDuplicates(int[] array) {

        int uniQueNumbers = 0;
        return uniQueNumbers;
    }


    */


