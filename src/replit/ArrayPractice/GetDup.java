package replit.ArrayPractice;

import java.util.Arrays;
import java.util.Collections;

public class GetDup {

    public static void main(String[] args) {


        int count = 0; // return the number of duplicates
        String[] r = {"1", "2", "aa", "1"};
        String nonDup = "";
        String word = "";
        System.out.println(getDup(r));


    }

    public static int getDup(String[] array) {

        int count = 0;

        for (String each : array) {



        }
        return count;
    }
}
/*
getDup accepts an array and returns an int.

If there is any element is duplicated, the method counts how many of those present in the array.

Example :

getDup(["1","2","aa"',"1"])

returns:2
("1" is duplicated and there are two "1"s so return is 2)
getDup(["1","2","aa"',"1", "aa"])

returns:4
("1" is duplicated and there are two "1"s
and 2 "aa"s so return is 4)
getDup(["1","g","aabb',"7","7","2","aa"',"7"])

returns:3
hint:

you will need a nested array the will run on the array we get from the method argument.
inside the nested loop you will need to check if the main array element is equal to the current
 */