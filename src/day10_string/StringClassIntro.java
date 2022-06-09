package day10_string;
import java.util.Scanner; // import a Scanner class
// import java.lang.String; //import a String Class
// import java.lang.System; // import a System Class

public class StringClassIntro {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String str = "Java";

        System.out.println();

        input.close();

        System.out.println("------------------------------------");

        String s1 = "Cat";
        String s2 = "Dog";
        String s3 = "Cat";
        String s4 = "Cat";

        System.out.println(s1 == s3); // true
        System.out.println(s1 == s4);

        //--------------------------------------------------------------

        String t1 = "Python";
        String t2 = new String("Python"); // creates two objects
        String t3 = new String("Python");

        System.out.println(t1 == t2); // not equal
        System.out.println(t2 == t3);

        System.out.println("------------------------------------------------");

        String str1 = new String("Java");
        String str2 = new String("Java");

        System.out.println(str1 == str2);


    }



}
