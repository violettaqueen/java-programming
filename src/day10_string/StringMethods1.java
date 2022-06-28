package day10_string;

import java.util.Scanner;

public class StringMethods1 {

    public static void main(String[] args) {

        String str = "Cydeo";
        // index:     01234

        // Char method:
        char firstChar = str.charAt(0); // returns a first char
        System.out.println("firstChar = " + firstChar);

        char secondChar = str.charAt(1);
        System.out.println("secondChar = " + secondChar);

        char thirdChar = str.charAt(2);
        System.out.println("thirdChar = " + thirdChar);

        char fourthChar = str.charAt(3);
        System.out.println("fourth = " + fourthChar);

        char fifthChar = str.charAt(4);
        System.out.println("firthChar = " + fifthChar);

        // System.out.println(nthChar);

        System.out.println("------------------------------------------");

        String sentence = "Java Programming language";

        int length = sentence.length(); // the length of string
        System.out.println(length);

        int lastIndex = length - 1; // to find put the last index in the string
        System.out.println(lastIndex);

        System.out.println("-------------------------------------");

        String s1 = "Wooden spoon";  // get a first and a last character
        char firstChar1 = s1.charAt(0);
        int lastIndexNum = s1.length() - 1; //length -1
        char lastCharacter = s1.charAt(lastIndexNum); // last character in string

        System.out.println(firstChar1 + ":" + 1);

        System.out.println("----------------------------------------");

        String name1 = "Umran"; //string object by literal in string pool
        String name2 = new String("Umran"); //outside the pool, in heap
        System.out.println(name1 == name2);
        System.out.println(name1.equals(name2)); // compare objects

        System.out.println("-----------------------------------------");

        String r1 = "Java"; // stored in string pool
        String r2 = "Java";
        String r3 = new String("java");

        //compare
        System.out.println(r1 == r2); // true
        System.out.println(r1 == r2); //false ===> comparing string as an object not as a value
        System.out.println(r2 == r3); //

        System.out.println(r1.equals(r3)); //true
        System.out.println(r2.equals(r3)); //true

        System.out.println("-------------------------------------");

        Scanner input = new Scanner(System.in);

        System.out.println("How old are you?");
        int age = input.nextInt();

        System.out.println("Are you a US citizen? yes/no");
        String answer = input.next();

        if (age >= 21 && answer.equals("yes")) {
            System.out.println("Eligible to vote");
        } else {
            System.out.println("Not Eligible to vote");
        }
        input.close();

    }

}
