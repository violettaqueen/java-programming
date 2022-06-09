package day04_concatenation;

public class FullName {

    public static void main(String[] args) {

        String name = "Daniel";
        String lastName = "Jefferson";

        String fullName = name + " " + lastName;
        System.out.println("Your full name is " + fullName);

        System.out.println("Your full name is " + name + (" ") + lastName);

    }

}
