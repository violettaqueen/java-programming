package day07_ifStatements;

public class IfStatementWithOutCurlyBraces {

    public static void main(String[] args) {

        int age = 32;

        if(age >= 21){
            System.out.println("Eligible");
        }else{
            System.out.println("Not Eligible");
        }

        System.out.println("------------------------------------");

        if(age >=21) System.out.println("Eligible");
        else System.out.println("Not Eligible");

        System.out.println("-------------------------------------");

        int day = 7;
        String result = "";

        if(day == 1) {
            System.out.println("Monday");
        }else if(day == 2) {
            System.out.println("Tuesday");
        } else if (day == 3) {
            result = "Wednesday";
        } else if (day == 4) {
            result = "Thursday";
        } else if (day == 5) {
            result = "Friday";
        } else if (day == 6) {
            result = "Saturday";
        }else {
            result = "Sunday";
        }
        System.out.println(result);
        }

    }

