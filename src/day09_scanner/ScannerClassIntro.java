package day09_scanner;
/*
Scanner class is used for reading files and keyboard entry
 */
import java.util.Scanner; // import the package name. always start with small letters
// import java.util.*;

public class ScannerClassIntro {

    public static void main(String[] args) {

        Scanner input = new Scanner (System.in);
        //               -object of scanner - is for reading user inputs

        System.out.println("Enter a number: ");
        byte num1 = input.nextByte(); // to make it reusable --> assign it to a variable

        System.out.println("You entered: " + num1);


        input.close();
        
    }





}
