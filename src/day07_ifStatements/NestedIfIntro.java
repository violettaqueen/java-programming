package day07_ifStatements;

public class NestedIfIntro {

    public static void main(String[] args) {

        int score = 95;

        if (score >= 0 && score <= 100) { // pre-condition, we have to have a score ~ 0 to 100

            if (score >= 60) {
                System.out.println("Passed");
            } else {
                System.out.println("Failed");
            }
        } else {  // this block gets executed if the score is not valid
            System.out.println("Invalid Score");
        }

        System.out.println("------------------------------------------------------------------------------");

        int age = -200; // 1 ~ 150

        if (age >= 1 && age <= 150) { // pre condition

            if (age >= 21) {
                System.out.println("Eligible");
            } else {
                System.out.println("Not eligible");
            }

        } else {
            System.out.println("Invalid age");
        }

        System.out.println("------------------------------------------------");


        int day = 100;

        /*
        if(day == 1){
            System.out.println("Monday");
        }else if(day ==2){
            System.out.println("Tuesday");
        }else if(day ==3){
            System.out.println("Wednesday");
        }else if(day ==4){
            System.out.println("Thursday");
        }else if(day ==5){
            System.out.println("Friday");
        }else if(day ==6){
            System.out.println("Saturday");
        }else if(day ==7){
            System.out.println("Sunday");
        }else{
            System.out.println("Invalid Number");
        }
         */


        if (day >= 1 && day <= 7) {

            if (day == 1) {
                System.out.println("Monday");
            } else if (day == 2) {
                System.out.println("Tuesday");
            } else if (day == 3) {
                System.out.println("Wednesday");
            } else if (day == 4) {
                System.out.println("Thursday");
            } else if (day == 5) {
                System.out.println("Friday");
            } else if (day == 6) {
                System.out.println("Saturday");
            } else {
                System.out.println("Sunday");
            }

        } else { // if the precondition is failed
            System.out.println("Invalid Day");
        }


    }

}

