package selfPractice.String;

import java.util.Locale;

public class FirstAnsLastName {

    public static void main(String[] args) {

        String firstName = "cyDEo";
        String lastName = "School";

        String result = "";

        firstName = firstName.substring(0,1).toUpperCase()+ firstName.substring(1).toLowerCase();

       result = firstName + " " + lastName;

        System.out.println(result);

    }

}
/*
Write a program that asks user to enter first and last names, and then prints the full name in
regular format (first character in upper case)

	                    input:
	                        firstName = "cyDEo"
	                        lastName = "SCHOOL";

	                    output:
	                        Cydeo School

 */