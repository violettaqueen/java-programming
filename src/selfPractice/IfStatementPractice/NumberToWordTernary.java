package selfPractice.IfStatementPractice;

public class NumberToWordTernary {

    public static void main(String[] args) {

        int num = 10;

        if (num >= 0 && num <= 9) {

            String word = (num == 0) ? "Zero" : (num == 1) ? "One" : (num == 2) ? "Two" : (num == 3) ? "Three" : (num == 4) ?
                    "Four" : (num == 5) ? "Five" : (num == 6) ? "Six" : (num == 7) ? "Seven" : (num == 8) ? "Eight" : "Nine";
            System.out.println(word);

        } else {
            System.out.println("Invalid number");
        }

    }
}
/*
Create a class called NumberToWord,
		write a java program that can convert numbers between 0 ~ 9 to words
			Ex:
				number = 1;

			output:
				One

		Note: MUST use ternary
 */