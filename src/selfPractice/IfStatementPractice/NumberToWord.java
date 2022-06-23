package selfPractice.IfStatementPractice;

public class NumberToWord {

    public static void main(String[] args) {

        int num = 1;

        String numberToWord = "";

        if (num == 0){
            numberToWord = "Zero";
        }
        if (num == 1) {
            numberToWord = "One";
        }
        if (num == 2){
            numberToWord = "Two";
        }
        if (num == 3){
            numberToWord = "Three";
        }
        if (num == 4){
            numberToWord = "Four";
        }
        if (num == 5){
            numberToWord = "Five";
        }
        if (num == 6){
            numberToWord = "Six";
        }
        if (num == 7){
            numberToWord = "Seven";
        }
        if (num == 8){
            numberToWord = "Eight";
        }
        if (num == 9){
            numberToWord = "Nine";
        }
        System.out.println(numberToWord);
    }

}
/*
Create a  class named NumberToWord, and write a java program that can convert numbers between 0 ~ 9 to words
			Ex:
				number = 1;

			output:
				One

		Note: Do not use more than one print statement
 */