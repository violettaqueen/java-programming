package selfPractice.Loops;

public class RetrieveChars {

    public static void main(String[] args) {

        String str = "mn@#123Ab!";
        String result = "";

        for (int i = 0; i <= str.length()-1; i++) {

            char each = str.charAt(i);

            if (each >= 48 && each <= 57){
                result += " " + each;
            } else if (each >= 'a' && each <= 'z' || each>='A' && each <='Z') {
                result += each;
            }else{
                result += each;
            }
        }
        System.out.println(result);

    }
}
