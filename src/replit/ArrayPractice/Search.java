package replit.ArrayPractice;

import java.util.ArrayList;
import java.util.Arrays;

public class Search {

    public static String search(ArrayList<String> r, String find) {

        String result = "";

        for (String eachWord : r) {

            if(eachWord.contains(find)) {
                result = eachWord.trim() + find;

        }else{
                    result = "search failed";
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



