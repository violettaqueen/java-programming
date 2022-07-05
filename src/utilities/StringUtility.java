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
    public static String digitLetterSpecChar(String str){

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
        return ("letters: " + isLetter + "\n" +"digits: " + isDigit +"\n"+ "special characters: " + isSpecialChar);



    }

}
