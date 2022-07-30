package selfPractice.ArrayPractice.day22_Practice;

public class UpperCaseAndLowerCase {

    public static boolean upperCaseAndLowerCase(String str) {

        int upperCase = 0;  // number of UpperCase
        int lowerCase = 0;  // number of LowerCase

        for (char each : str.toCharArray()) {
            if (Character.isUpperCase(each)) {
                upperCase++;
            } else if (Character.isLowerCase(each)) {
                lowerCase++;
            } else {
                continue; // otherwise skip
            }
        }
        return upperCase==lowerCase;
    }




    public static void main(String[] args) {

        System.out.println(upperCaseAndLowerCase("JAVA java"));
    }
}
