package selfPractice.IfStatementPractice;

public class CharacterIdentity {

    public static void main(String[] args) {

        char ch = '8';
        String result = "";

        boolean isDigit = ch >= '0' && ch <= '9';
        boolean isCharacter = ch >= 'A' && ch <= 'Z' || ch >= 'a' && ch <= 'z';
        boolean isSpecialChar = !isDigit && !isCharacter;

        if (isSpecialChar){
            result = "Special Character";
        }
        if (isDigit) {
            result = "Digit";
        }
        if (isCharacter) {
            result = "Character";
        }

        System.out.println(result);


    }
}
/*
Create a class named CharacterIdentity, and write a program that can identify if the given character is a digit or Alphabetic
Character(A~Z or a~Z) or a special character

		Ex:
			ch = '@'

		output:
			Special Character


			ch = '1'

		output:
			digit

		HINT: You may want to check out the numbers of the characters on ASCII table
 */