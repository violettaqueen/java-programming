package replit.ArrayPractice;

import java.util.ArrayList;
import java.util.Arrays;

public class Search {

    public static String search(ArrayList<String> r, String find) {

        String result = "";
        String word = "";

        for (int i = 0; i < r.size(); i++) {
          word = r.get(i);
        }
            if (word.contains(find)) {
                result = word;

            } else {
                result = "search failed";
            }

        return result;
    }

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
        list.addAll(Arrays.asList("4", "lea","led","mop","lead","make"));

        System.out.println(search(list, "4"));
    }


}



