package selfPractice.Loops.ForLoop;

import utilities.StringUtility;

public class RetrieveChars {

    public static void main(String[] args) {

        String str = "mn@#123Ab!";

        String isDigit ="";
        String isLetter = "";
        String isSpecialChar = "";

        for (int i = 0; i <= str.length()-1; i++) {

            char each = str.charAt(i);

            if (each >= '0' && each <= '9'){
                isDigit +=  each;
            } else if (each >= 'a' && each <= 'z' || each>='A' && each <='Z') {
               isLetter += each;
            }else{
                isSpecialChar += each;
            }
        }
        System.out.println("letters: " + isLetter);
        System.out.println("digits: " + isDigit);
        System.out.println("special characters: " + isSpecialChar);


        System.out.println(StringUtility.digitLetterSpecChar("Violett123!@#"));

    }
}
