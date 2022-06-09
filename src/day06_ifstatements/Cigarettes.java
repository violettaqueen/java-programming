package day06_ifstatements;

public class Cigarettes {

    public static void main(String[] args) {

        int age = 16;
        boolean isEligible = age >= 21 && age < 100;
        boolean notEligible = age < 21 || age > 100;
        // if(age >= 21){

        if (isEligible) {
            System.out.println("You are eligible");
        }
        if (notEligible) {
            System.out.println("You are not eligible to buy Cigarettes");
        }
    }

}
