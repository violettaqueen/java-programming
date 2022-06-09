package day08_ternary_switch;
/*
Create a class called OxygenTank. You are diving in the ocean. Your oxygen tank has a certain level (number) and you must print a message based on the level:
                Above 90 -  Your tank is full
                Above 80 -  Still okay
                Above 70 -  Don't go too far
                Above 60 -  Start to head back
                Above 50 -  Be careful now you at 50%

                USE ONE PRINT STATEMENT ONLY

            Solution 1: Must use ternary
			Solution 2:	MUST use switch statement

 */

public class OxygenTank {

    public static void main(String[] args) {

        int level = 85;        /* String result = (level > 90)?"Your tank is full" :(level > 80)?"Still ok"
                :(level > 70)?"Don't go too far" :(level > 60)?"Start to head back"
                : "Be careful now you are at 50%";
        System.out.println(result);*/

        String result = "";
        switch (level) {
            case (90):
                result = ("Your Tank is full");
                break;
            case (80):
                result = ("Still ok");
                break;
            case (70):
                result = ("Don't go too far");
                break;
            case (60):
                result = ("Start to head back");
                break;
            case (50):
                result = ("Be careful now you are at 50%");
                break;

            default: result = "Invalid";

        }
        System.out.println(result);
    }

}
