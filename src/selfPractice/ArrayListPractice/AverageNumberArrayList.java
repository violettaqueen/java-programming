package selfPractice.ArrayListPractice;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;

public class AverageNumberArrayList {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.addAll(Arrays.asList(1, 4, 8, 12, 3, 7));

        int sum = 0;

        for (Integer each : list) {
            sum += each;
        }

        double average = sum / (double) list.size();
        DecimalFormat df = new DecimalFormat("0.00");
        System.out.println(df.format(average));
    }


}
