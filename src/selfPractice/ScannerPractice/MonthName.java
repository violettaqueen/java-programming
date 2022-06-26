package selfPractice.ScannerPractice;

import java.util.Scanner;

public class MonthName {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a month number: ");
        int month = input.nextInt();
        String result = "";


        result = (month == 1)?"Jan":(month == 2)?"Feb":(month==3)?"Mar":(month==4)?"Apr":(month==5)?"May"
                :(month==6)?"June":(month==7)?"July":(month==8)?"Aug":(month==9)?"Sept":(month==10)?"Oct" :(month==11)?"Nov":"December";

        System.out.println(month + " is " + result);
    }
}
/*
 MonthName
            3.1 Ask the user to enter a number
            3.2 Display the month name
 */