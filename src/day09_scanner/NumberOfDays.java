package day09_scanner;
/*
 2.Create a class named NumberOfDays, an integer variable named month is given,
  Use switch statement to write a program that can find the number of days in the given number of month.

            EX:
                month = 5

            output:
                31 days

            (Assume that February has 28 days)

        Hints:
            Months that has 31 days: 1, 3, 5, 7, 8, 10, 12
            Months that has 30 days: 4, 6, 9, 11
 */

public class NumberOfDays {

    public static void main(String[] args) {

        int month = 6;
        String result = "";
        switch (month){
            case 1 :
                System.out.println("31 days"); break;
            case 2 :
                System.out.println("28 days"); break;
            case 3:
                System.out.println("31 days"); break;
            case 4:
                System.out.println("30 days"); break;
            case 5 :
                System.out.println("31 days"); break;
            case 6 :
                System.out.println("30 days"); break;
            case 7 :
                System.out.println("31 days"); break;
            case 8 :
                System.out.println("30 days"); break;
            case 9 :
                System.out.println("30 days"); break;
            case 10 :
                System.out.println("31 days"); break;
                case 11 :
                    System.out.println("30 days"); break;
            case 12 :
                result = "31 days";

            default:
                result = " invalid";
        }

    }

}
