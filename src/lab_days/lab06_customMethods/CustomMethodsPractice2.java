package lab_days.lab06_customMethods;

public class CustomMethodsPractice2 {
    public static void main(String[] args) {

        String result1 = comboString("Hello", "Hi");
        System.out.println(result1);
        System.out.println("----------------------------------------------------------------------");

        System.out.println(left2("Java"));
        System.out.println(rotatedLast2("hello"));

        System.out.println(rotatedLast2("Violetta"));
        System.out.println(frontAgain("edited"));
        System.out.println("--------------------------------------------------------------------------");

        System.out.println(countHi("Hi Hi Hi Hi"));
    }


    public static String comboString(String a, String b) {

        if (a.length() > b.length()) {
            return b + a + b;
        } else if (b.length() > a.length()) {
            return a + b + a;

        } else {
            return a + b;
        }


    }

    public static String left2(String str) {

        if (str.length() < 3) {
            return str;
        }
        String s1 = str.substring(0, 2); //to get first 2 chars "He"
        String s2 = str.substring(2); // to get remaining "llo"

        return s2 + s1;
    }

    public static String rotatedLast2(String str) {

        if (str.length() < 3) {
            return str;
        }
        String s1 = str.substring(0, str.length() - 2);
        String s2 = str.substring(str.length() - 2); // from second last chars

        return s2 + s1;
    }

    public static boolean frontAgain(String str) {

        if (str.length() < 2) {
            return false;
        }

        return (str.substring(0, 2).equals(str.substring(str.length() - 2)));

    }

    public static int countHi(String str) {

        return StringUtility.frequency(str, "Hi");


    }

    public static boolean catDog (String str){

        str = str.toUpperCase(); // to ignore case sensetivity
        int countCat = StringUtility.frequency(str, "cat");
        int countDog = StringUtility.frequency(str, "dog");
        return countDog ==countCat;
    }
}







