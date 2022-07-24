package replit.ArrayPractice;

import java.util.ArrayList;

public class SizeAndGet {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(10);
        list.add(10);

        int sum = 0;

        for (Integer eachNum : list) {
            sum += eachNum ++;
        }
        System.out.println(sum);
    }
}
