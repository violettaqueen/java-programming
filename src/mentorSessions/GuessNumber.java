package mentorSessions;

import java.util.Scanner;

public class GuessNumber {

    public static void main(String[] args) {

        int targetNumber = 37;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");
        input.nextInt();

        int num = 0;

        while((num < 1 && num > 100)){
            System.out.println("Inavlid number. Please re-enter");
            input.nextInt();
        }

            if(num == targetNumber){
                System.out.println("Congratulations. Target number is found.");
            }else{
                System.out.println("Try again");
                input.nextInt();

        }


        }
    }


