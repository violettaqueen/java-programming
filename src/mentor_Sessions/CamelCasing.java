package mentor_Sessions;

import java.util.Arrays;

public class CamelCasing {

    public static String camelCasing(String str) {

        String result = " ";
        for (char each: str.toCharArray()) {

            if(each != Character.toUpperCase(each)){
                result += each;
            }else if(each == Character.toUpperCase(each)) {
                result += " " + Character.toUpperCase(each);
            }else{
                result += str;
            }
        }
        return result.trim();

    }

    public static void main(String[] args) {

        String word = "The Stealth Warrior";
        System.out.println(camelCasing(word));

    }
}




