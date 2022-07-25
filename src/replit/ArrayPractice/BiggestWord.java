package replit.ArrayPractice;

import java.util.Arrays;
import java.util.Collections;

public class BiggestWord {

    public static void main(String[] args) {


        String[] words = {"aaa, bbbbb, whasstupppp, longg, jaaaaavvaaaaaaaaaa"};
        String biggest = "";
        int max = 0;

        for (String each : words) {
            for (int i = 0; i < each.length(); i++) {
                if (each.length() > max) {
                    max = each.length();
                }

            }
            System.out.println(biggest);

        }

    }
}