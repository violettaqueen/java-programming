package day42_maps;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

public class FrequencyOfCharacters {

    public static void main(String[] args) {

        // linkedHashMap

        String str = "bbcccaaaa";  // characters will be a key

        Map<Character, Integer> map = new LinkedHashMap<>();

        // convert string to an array

        for (String each : str.split("")) {
            int frequency = Collections.frequency(Arrays.asList(str.split("")), each);

            // System.out.println(each + " : " + frequency);
            // add the result to a map

            map.put(each.charAt(0), frequency);

        }
        System.out.println(map);
    }
}
