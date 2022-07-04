package replit.StringPractice;

public class CountJava {

    public static void main(String[] args) {

        String sentence = "What's the difference between java, java, javascript and python?";

        int count = 0;
        String word = "java";
        String word2 = "python";
        boolean result = false;

        for (int i = 0; i <= sentence.length()-1; i++) {
            if (i == sentence.indexOf("java")){
                count++;
            }
            System.out.println(count);
        }
    }

}
/*
Use a loop to count how many times the characters java and python are found in the given String
 sentence. Output true if java and python appear the same number of times, otherwise output false.
Note: Case sensitivity should be considered. We are looking for the lowercase character versions
of both Strings
Main topics: loops, primitive datatypes, operators, Scanner, String, if statements

Ex:
  Input:
    We study java not python

  Output:
    true
Ex:
  Input:
    What's the difference between java, javascript and python?

  Output:
    false

  -> the 'java' characters appear 2 times in the String but the 'python' characters appear
   only 1 time.
Ex:
  Input:
   Java is a general-purpose computer-programming language that is concurrent,
   class-based, object-oriented,[15] and specifically designed to have as few implementation
    dependencies as possible.

  Output:
    true

  -> The first word 'Java' is not counted because it starts with the uppercase 'J', so the
  number of times 'java' and 'python' appear in this String is 0 and 0 and since they are the
  same, the output is true
 */