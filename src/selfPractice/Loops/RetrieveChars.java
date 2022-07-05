package selfPractice.Loops;

public class RetrieveChars {

    public static void main(String[] args) {

        String str = "mn@#123Ab!";
        String result = "";

        for (int i = 0; i < str.length()-1; i++) {

            if (str.charAt(i) >= 48 && str.charAt(i) <= 57){
                result += str.substring(str.charAt(i));
            }
        }
    }
}
