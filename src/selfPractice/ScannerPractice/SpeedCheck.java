package selfPractice.ScannerPractice;

import java.util.Scanner;

public class SpeedCheck {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int speedLimit = 55;

        System.out.println("Enter your current speed: ");
        int currentSpeed = input.nextInt();

        int difference = 0;


        if (currentSpeed > speedLimit){
            difference += currentSpeed - speedLimit;
            System.out.println("Your current speed: " + currentSpeed);
            System.out.println("You are driving " + difference + " miles over the speed limit. Slow down!");
        }else{
            System.out.println();
        }
        input.close();

    }
}
/*
Create a class named SpeedCheck and write a program for the speed check.
	A variable named speedLimit is declared and given
	ask user to enter the current speed, if the current speed is over the speedLimit print slow down, otherwise do not print anything
        Ex:
            speedLimit = 55;

            Enter current speed:
            105

            output:
            	You're driving 50 mph over the limit. Slow down!


 */