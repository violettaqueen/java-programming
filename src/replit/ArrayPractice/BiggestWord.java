package replit.ArrayPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class BiggestWord {

    public static void main(String[] args) {


        String[] words = {"aaa", "bbbbb", "whasstupppp", "longg", "jaaaaavvaaaaaaaaaa"};
        String biggest = "";
        ArrayList<String> list = new ArrayList<>();

        int max = 0;


        for (int i = 0; i < words.length; i++) {
           if( words[i].length() > max){
               max = words[i].length();
               if(words[i].equals(max)){
                   System.out.println(words[i]);
               }
           }
        }

    }


}




