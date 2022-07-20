package replit.methods;

import utilities.StringUtility;

public class CountLetters {

    public static void main(String[] args) {

        String str = "aaabbcccc";
        String result = ""; // "3a2b4c"

        for (int j = 0; j < str.length(); j++) {
            char ch = str.charAt(j);
            int count = 0;
            for (int i = 0; i < str.length(); i++) {
                if (ch == str.charAt(i)) {
                    count++;
                }
            }
            if(result.contains(ch + "")){
                continue;
            }
            result += ch;
            result += count;


        }
        System.out.println(result);

        System.out.println(StringUtility.countLetters("aaabbbcccdddd"));

    }
}
