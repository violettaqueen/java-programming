package day06_ifstatements;

public class IfAndElseStatementInfo {

    public static void main(String[] args) {

        int age = 28;

        if (age >= 21) {
            System.out.println("Eligible");

        }
        if (age < 21) {
            System.out.println("Not Eligible");
        }

        System.out.println("---------------------------------");

        if (age >= 21) {
            System.out.println("Eligible");
        } else { //otherwise
            System.out.println("Not eligible");
        }

        System.out.println("-----------------------------------------");


    }
}
