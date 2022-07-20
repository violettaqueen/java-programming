package utilities;

public class StringUtility {

    public static String reverse(String str) {
        String reverse = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            reverse += str.charAt(i);
        }

        return reverse;
    }

    public static String initials(String firstName, String lastName) {

        firstName = firstName.substring(0, 1).toUpperCase();
        lastName = lastName.substring(0, 1).toUpperCase();
        return (firstName + "." + lastName + ".");
    }

    public static String digitLetterSpecChar(String str) {

        String isDigit = "";
        String isLetter = "";
        String isSpecialChar = "";

        for (int i = 0; i <= str.length() - 1; i++) {

            char each = str.charAt(i);

            if (each >= '0' && each <= '9') {
                isDigit += each;
            } else if (each >= 'a' && each <= 'z' || each >= 'A' && each <= 'Z') {
                isLetter += each;
            } else {
                isSpecialChar += each;
            }
        }
        return ("letters: " + isLetter + "\n" + "digits: " + isDigit + "\n" + "special characters: " + isSpecialChar);


    }

    public static int sumOfCharacters(String str) {

        int sum = 0;

        for (int i = 0; i < str.length(); i++) {
            char each = str.charAt(i);

            if (each >= '0' && each <= '9') {
                sum += each - 48;
            }
        }

        return sum;
    }

    public static boolean isPalindrome(String str) {

        String result = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            result += str.charAt(i);
        }
        boolean isPalindrome = str.equalsIgnoreCase(result);
        return isPalindrome;
    }

    public static int frequencyOfChar(String str, char ch) {

        int count = 0;

        for (int i = 0; i < str.length(); i++) {

            if (str.charAt(i) == ch) {
                count++;
            }
        }
        return count;
    }

    public static String uniqueCharacter(String str) {

        String unique = "";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            int count = 0;

            for (int j = 0; j < str.length(); j++) {
                char each = str.charAt(j);

                if (ch == each) {
                    count++;
                }
            }
            if (count == 1) {
                unique += ch;
            }
        }
        return unique;
    }

    public static String countLetters(String str) {

        String result = "";
        for (int j = 0; j < str.length(); j++) {

            char ch = str.charAt(j);
            int count = 0;
            for (int i = 0; i < str.length(); i++) {
                if (ch == str.charAt(i)) {
                    count++;
                }
            }
            if(result.contains("" +ch)){
                continue;
            }
            result += ch;
            result += count;
        }
        return result;
    }


}
