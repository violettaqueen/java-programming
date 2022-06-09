package day12_customMethods;

import java.util.Scanner;

public class FormatFullName {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your first name:");
        String firstname = input.next();

        System.out.println("Enter your last name:");
        String lastname = input.next();

        input.close();

        //firstname = "cyDEO"; //first char of first name
        //lastname = "SCHOOL"; // delete this if you use scanner, we change them for a scanner

        firstname = firstname.substring(0, 1).toUpperCase() + firstname.substring(1
        ).toLowerCase(); // getting a first char 'c' + remaining characters of first name
        //get a first char of first name + the remaining characters
        // "c"
        System.out.println(firstname);

        lastname = lastname.substring(0, 1) + lastname.substring(1).toLowerCase();

        System.out.println(lastname);

        String full_name = firstname + " "+ lastname;
        System.out.println(full_name);


    }

}
/*
1. Write a program that asks user to enter first and last names, and
then prints the full name in regular format (first character in upper case)

	                    input:
	                        firstName = "cyDEo"
	                        lastName = "SCHOOL";

	                    output:
	                        Cydeo School

 */