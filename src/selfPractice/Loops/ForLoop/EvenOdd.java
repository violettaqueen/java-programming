package selfPractice.Loops.ForLoop;

public class EvenOdd {

    public static void main(String[] args) {


        String isEven = "";
        String isOdd = "";

        for (int i = 1; i <= 20; i++) {

            if (i % 2 == 0) {
                isEven += " " + i;
            }else{
                isOdd += " " + i;
            }
        }
        System.out.println(isEven.trim());
        System.out.println(isOdd.trim());






    }


}

/*
Use a loop to print all the even numbers from 1 to 20. Print each number on the same line, with
 spaces between each
Use another loop to print all the odd numbers from 1 to 20. Print each number on the same line,
 with spaces between each
Note: In the end there will be two lines. First the line to show all the even numbers and then
another line to show all the odd numbers
Main topics: loops, primitive datatypes, if statement, operators

Example Flow:

2 4 6 .... 18 20
1 3 5 .... 17 19
 */