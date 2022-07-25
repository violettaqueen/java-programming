package replit.ArrayPractice;

import java.util.ArrayList;
import java.util.Arrays;

public class CombineArrays {

    public static void main(String[] args) {

        String [] r1 = {"f","o","o"}, r2 = {" b","a","r"};

        ArrayList<String> combineRs = new ArrayList<>();

        for (String each : r1) {
            combineRs.add(each.trim());
        }
        for (String each : r2) {
            combineRs.add(each.trim());
        }
        System.out.println(combineRs);
    }

}

/*
    public static ArrayList<String> combineRs(String[] r1, String[] r2){

        String [] strs3 = new String [r1.length + r2.length];

        int k = 0;

        for(int i = 0; i < r1.length; i++, k ++){
            strs3[k] = r1[i];
        }
        for (int i =0; i < r2.length; i++, k++){
            strs3[k] = r2[i];
        }

        ArrayList<String> combine = new ArrayList<>();
        combine.addAll(Arrays.asList(strs3));
       return ArrayList<String> combine;

    }

}
}
/*
Finish the combineRs method to combine the two given String arrays into one arraylist and return the arraylist.

for example:

combineRs(["f","o","o"],[" b","a","r"])

returns [f, o, o, b, a, r]
combineRs(["1","2","3"],["4"])

returns [1, 2, 3, 4]
 */