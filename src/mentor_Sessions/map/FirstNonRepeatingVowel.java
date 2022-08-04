package mentor_Sessions.map;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonRepeatingVowel {

    public static void main(String[] args) {

        System.out.println(firstNonRepeatingVowel("google"));
    }

    public static int firstNonRepeatingVowel(String str) {

        Map<Character, Integer> map = new LinkedHashMap<>();

        for (int i = 0; i < str.length(); i++) {
           char ch = str.charAt(i);
            if (ch == 'a'|| ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                if(!map.containsKey(ch)){
                    map.put(ch, i);
                }else {
                    map.put(ch, -1);
                }
            }
        }
        for (Integer eachValue : map.values()) {
            if(eachValue >= 0){
                return eachValue;
            }
        }
        return -1;
        }



    }

