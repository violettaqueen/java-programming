package selfPractice.ArrayListPractice;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListMaxAndMinNumbers {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1,2,3,4,5));
        System.out.println(list);

        int max = 4; //index number
        int min = 0; //index number

        for (Integer eachElement : list) {

            if(eachElement <  max){
                max = eachElement;
            }
            if(eachElement > min){
                min = eachElement;
            }
        }
        System.out.println("min = " + min);
        System.out.println("max = " + max);

    }


}
