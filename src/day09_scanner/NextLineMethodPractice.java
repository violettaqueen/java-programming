package day09_scanner;
import java.util.Scanner;

public class NextLineMethodPractice {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in); //EnterEnter

        System.out.println("Enter your full name: ");
        String full_name = input.nextLine(); // Violetta Queen + Enter

        System.out.println("Enter your school name: ");
        String school_name = input.nextLine();// Cydeo School + Enter

        System.out.println("Enter your gender: ");
        String gender = input.next(); //Male

        System.out.println("Enter your age: ");
        int age = input.nextInt(); //28

        input.nextLine(); // we have to give extra nextLine() if we are using
// a nextLine() method after the other methods of scanner
        System.out.println("Enter your street name: ");
        String address = input.nextLine();

    }

}
