package selfPractice.Loops;

public class SomeOfDigits {

    public static void main(String[] args) {

        String str = "A1B2C3";
        int sum = 0;

        for (int i = 0; i < str.length(); i++) {
            char each = str.charAt(i);

            if (each >= '0' && each <= '9') {
                sum += each - 48;
            }
        }

                System.out.print(sum);
            }
        }


/*
Write a program that can return the sum of digits from a  string
             Ex:
                 input: A1B2C3

                 output:    6

             Hint: You need to get each of the character by using a loop
	             	To convert char to number:
						             	   '0' - 48   ==> 0
						             	   '1' - 48   ==> 1
 */