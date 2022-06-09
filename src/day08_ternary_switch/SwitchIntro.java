package day08_ternary_switch;
// can't use ||
// all cases should be unique, and not dublicated
// use switch when number is equal, not a between numbers
// boolean, long, float, double is not accepted
// switch statement keywords: switch, case, default, break
//syntax: switch (Data/Variable){
/*
case data1 :
statements;
break;
default: Statement;

default block gets executed if none of the case values matched with switch expression
or logic we can use it in switch by declaring the case blocks back to back
 */

public class SwitchIntro {

    public static void main(String[] args) {

        char grade = 'B';
        String result = "";

        if(grade == 'A'){
            result = "Excellent";
        } else if (grade == 'B') {
            result = "Great Job";
        } else if (grade == 'C') {
            result = "Good";
        } else if (grade == 'D') {
            result = "Passed";
        }else{
            result = "Failed";
        }

        System.out.println(grade);

        System.out.println("-------------------------------------");

        switch (grade){
            case 'A':
                System.out.println("Excellent");
                break;
            case 'B':
                System.out.println("Great job");
                break;
            case 'C':
                System.out.println("Good");
                break;
            case 'D':
                System.out.println("Passed");
                break;
            case 'F':
                System.out.println("Failed");
                break;

            default:
                System.out.println("Invalid");


        }

    }

}
