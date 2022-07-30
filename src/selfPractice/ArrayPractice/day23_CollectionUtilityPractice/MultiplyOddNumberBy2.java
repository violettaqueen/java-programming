package selfPractice.ArrayPractice.day23_CollectionUtilityPractice;

import java.util.ArrayList;
import java.util.Arrays;

public class MultiplyOddNumberBy2 {

    public static ArrayList<Integer> multiplyOddNumbersBy2(ArrayList<Integer> list){

        for (int i = 0; i < list.size(); i++) {
            if(list.get(i) %2 !=0){
                list.set(i, list.get(i) *2);
            }
        }
        return list;
    }
    public static ArrayList<Integer> multiplyEvenNumberBy2(ArrayList<Integer> list){

        for (int i = 0; i < list.size(); i++) {
            if(list.get(i) %2 == 0){
                list.set(i, list.get(i)*2);
            }
        }
        return list;
    }

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5));

        System.out.println(multiplyOddNumbersBy2(list));
    }
}
