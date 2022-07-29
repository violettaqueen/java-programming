package day24_dateAndTime;

import java.util.Arrays;
import java.util.Collections;

public class FrequencyOfCharacters {

    public static void main(String[] args) {

        String str = "aaabbbbbbcccc";
        // return frequency of every single character
        // a3b5c4

        String result = ""; //to contain the final result

        // create a collection out of a string --> create a string array

        // split the string
        for(String each : str.split("")){

            int frequency = Collections.frequency(Arrays.asList(str.split("")), each );

            if(!result.contains(each)){ // to avoid a duplication, it's not going to concate another a
                result += each + frequency;
            }

        }

    }

}
