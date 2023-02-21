package day43_generics;

import java.util.Arrays;

public class WriteAGenericMethod {

    // generic method: because
    public static void main(String[] args) {

        Integer[] a = {1,2,3,4};
        swap(a,0,2);
        System.out.println(Arrays.toString(a));


    }
    private static void swap(Integer[] array, int i, int j){ // not a generic method

        Integer temp = array[i];
        array[i] = array[j];
        array[j] = temp;

    }
    private static<T> void swap(T[] a, int i, int j){

        T temp = a[i];
        a[i] = a[j];
        a[j] = temp;



    }
}
