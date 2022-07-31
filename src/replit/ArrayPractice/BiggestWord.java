package replit.ArrayPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class BiggestWord {

    public static void main(String[] args) {


        String[] words = {"aaa", "bbbbb", "whasstupppp", "longg", "jaaaaavvaaaaaaaaaa"};
        String biggest = "";
        ArrayList<String> list = new ArrayList<>(Arrays.asList(words));

        int max = list.get(0).length();

        for (String each : list) {

            if(each.length() > max){
                max = each.length();
                biggest = each;
            }
        }
        System.out.println(biggest);
        }






    }







