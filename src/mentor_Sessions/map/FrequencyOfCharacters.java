package mentor_Sessions.map;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

public class FrequencyOfCharacters {

    public static void main(String[] args) {

        String str = null;

        Map<Character, Integer> map = new LinkedHashMap<>();

        for (String each : str.split("")) {
            int frequency = Collections.frequency(Arrays.asList(str.split("")), each);
            if (str.isEmpty()) {
                map.clear();
            } else if (str == null) {
                System.out.println("null");
            } else {
                map.put(each.charAt(0), frequency);

            }




        }
        System.out.println(map);
    }
}
