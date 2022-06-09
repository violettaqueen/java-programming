package day11_string;

public class StringMethods1 {

    public static void main(String[] args) {

        String str1 = "CYDEO SCHOOL";

        str1.toLowerCase(); //"cydeo school" // gives a new string with all lowercase
        str1 = str1.toLowerCase();
        System.out.println(str1);

        // -----------------------------------------------------

        String str2 = "Java programming";  // - this object is literal
        str2 = str2.toUpperCase(); //"JAVA PROGRAMMING"
        System.out.println(str2);

        // if you don't want to change str2 variable, you can assign a new variable str3
        // ex. str3 = str2.toUpperCase(); //"JAVA PROGRAMMING"

        // -----------------------------------------------------

        String word = "Wooden Spoon";

        word = word.toUpperCase(); // new string "WOODEN SPOON"
        word = word.toLowerCase(); // new string "wooden spoon"

        System.out.println(word);

        // ------------------------------------------------------

        String str4 = "   Cydeo School";

        str4 = str4.trim(); //for removing white spaces
        System.out.println(str4);

        // --------------------------------------------------------
        // indexOf() method

        String sentence1 = "Today is Sunday, and we have Java Class";
        int index1 = sentence1.indexOf('w'); //you can pass either 1 character or a sequence of characters
        System.out.println("index1: " + index1);

        String s1 = "I love Java Programming";

        int firstA = s1.indexOf('a');
        System.out.println("firstA: " + firstA);

        int secondA = s1.indexOf("a "); // second a - a + space

        String s2 = "Java Python JavaScript Cydeo Python";
        int a1 = s2.indexOf('a');
        System.out.println("a1:" + a1);

        int a2 = s2.indexOf("a Python"); // options ("a Python")
        System.out.println("a2: " + a2);

        int a3 = s2.indexOf("avaScript");
        System.out.println("a3: " + a3);

        int a4 = s2.indexOf("aS");
        System.out.println("a4: " + a4);

        // lastIndexOf() method --------------------------------------------------------------------------

        String word1 = "Java"; //index of first a is 1
        System.out.println(word1.indexOf('a'));

        System.out.println(word1.lastIndexOf('a')); //index #3

String word2 = "Java Python JavaScript Cydeo Python";
        System.out.println(word2.lastIndexOf('a'));
        System.out.println(word2.lastIndexOf('P'));

    }

}
