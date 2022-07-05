package replit.StringPractice.Loops;

public class Vowels {

    public static void main(String[] args) {

        String word = "java";

        for (int i = 0; i <= word.length()-1; i++) {
            char each = word.charAt(i);

            if (each == 'a' || each == 'e' || each == 'i' || each == 'o' || each == 'u'){
                System.out.print(each);
            }

        }



    }
}
/*
Use a loop to print each vowel( a, e, i, o, u) from the given word
Main topics: loops, primitive datatypes, operators, Scanner, String, if statements

Ex:
  Input:
    howdyho

  Output:
    oo
Ex:
  Input:
    java

  Output:
    aa
Ex:
  Input:
    apple

  Output:
    ae
 */