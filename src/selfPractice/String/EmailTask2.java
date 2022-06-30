package selfPractice.String;

public class EmailTask2 {

    public static void main(String[] args) {

        String email = "craig_federighi@apple.com";

        String firstName = email.substring(0, email.indexOf("_")); //craig
        String toUpperCase = firstName.substring(0,1).toUpperCase() + firstName.substring(1);

        String lastName = email.substring(email.indexOf("_")+1, email.indexOf("@"));
        String toUpperCase2 = lastName.substring(0,1).toUpperCase() + lastName.substring(1);

        String domain = email.substring(email.indexOf("@")+1, email.indexOf('.'));

        System.out.println("First name: " + toUpperCase);
        System.out.println("Last name: " + toUpperCase2);
        System.out.println("Domain: " + domain);
    }
}
/*
 Create a class called EmailTask2.
       Assume that email address is constructed by person's first name and followed by an underscore and last name.

       Write a program that will print out information about user based on email. Print first name, last name, and domain.

       First and Last name should be printed with proper format - uppercase first letter and remaining lowercase.

               Ex:
                   input:
                       craig_federighi@apple.com

                Output:
                    First name: Craig
                    Last name: Federighi
                    Domain: apple
 */