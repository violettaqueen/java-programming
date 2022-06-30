package selfPractice.String;

public class CalledEmailTask {

    public static void main(String[] args) {

        String email = "mike_tyson@gmail.com";

        String emailFirst = email.substring(0, email.indexOf("_"));
        String emailSecond = email.substring(email.lastIndexOf("t"), email.lastIndexOf("@"));

        String gmail = email.substring(email.indexOf("@"), email.length());
        String result = emailSecond + "_" + emailFirst + gmail;

        if (email.contains("_")) {
            System.out.println(result);
        } else {
            System.out.println(email);
        }

    }
}
/*
 Create a class calledEmailTask1.
       Assume that email address is constructed by person's first name and followed by an underscore
       and last name.

        Write a program that can swap first name with last name in the email (Seperated by an underscore).
        If the email doesn't contain an underscore print the given input email.

            Ex:
                input: mike_tyson@gmail.com
                output: tyson_mike@gmail.com

 */