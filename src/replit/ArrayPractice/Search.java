package replit.ArrayPractice;

import java.util.ArrayList;
import java.util.Arrays;

public class Search {

    public static String search(ArrayList<String> r, String find) {

        String result = "";
        String word = "";

        for (String eachWord : r) {

            for (int i = 0; i < eachWord.length(); i++) {

                if(eachWord.contains(find)){
                    result = eachWord.trim();
                }else{
                    result = "search failed";
                }
            }
        }




        return result;
    }

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
        list.addAll(Arrays.asList("hello","world", "lead"));

        System.out.println(search(list, "lead"));
    }


}



