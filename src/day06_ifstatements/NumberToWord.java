package day06_ifstatements;

public class NumberToWord {

    public static void main(String[] args) {

        int n = 9;
        String result = "";
        if (n == 0) {
            result = "zero";
        }
        if (n == 1) {
            result = "one";
        }
        if (n == 2) {
            result = "two";
        }
        if (n == 3){
            result = "three";
        }
        if ( n == 4){
            result = "four";
        }
        if(n == 5){
            result = "five";
        }
        if( n == 6){
            result = "six";
        }
        if (n == 7){
            result = "seven";
        }
        if (n == 8){
            result = "eight";
        }
        if(n == 9){
            result = "nine";
        }


            System.out.println(result);
        }
    }



/*
2. Create a  class named NumberToWord, and write a java program that can convert numbers between 0 ~ 9 to words
			Ex:
				number = 1;

			output:
				One

		Note: Do not use more than one print statement
 */