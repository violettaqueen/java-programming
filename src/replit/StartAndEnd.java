package replit;

import java.util.Scanner;

public class StartAndEnd {

    public static void main(String[] args) {
        //DO NOT TOUCH BELOW
        Scanner s = new Scanner(System.in);
        String word = s.next();

        //WRITE YOUR CODE BELOW
        boolean startsWithA = word.startsWith("a");
        boolean endsWithE = word.endsWith("e");


        System.out.println("Starts with a: " + startsWithA);

        System.out.println("Ends with e: " + endsWithE);


    }
}

/*
Ex:
  Input:
    apple

  Output:
    Starts with a: true
    Ends with e: true
 */
