package replit.ArrayPractice;

import java.util.ArrayList;
import java.util.Arrays;

public class AppendPosSum {

    public static ArrayList<Integer> appendPosSum(ArrayList<Integer> list) {

        ArrayList<Integer> newList = new ArrayList<>();

        for (Integer eachNum : list) {

            if (eachNum > 0) {
                newList.addAll(Arrays.asList(eachNum));
            }
        }
            int sum = 0;
            for (Integer each : newList) {
                sum += each;
            }

            newList.add(newList.size() , sum);  // this statement out of loop

        return newList;
    }

    public static void main(String[] args) {

        ArrayList<Integer> newList1 = new ArrayList<>();

        newList1.addAll(Arrays.asList(4, -6, 3, -8, 0, 4, 3, 14));


        System.out.println(appendPosSum(newList1));

    }
}