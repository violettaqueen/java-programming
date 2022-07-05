package replit.StringPractice;

public class CountTriples {

    public static void main(String[] args) {

        String word = "xxxabyyyycd";
        int result = 0;


        for (int i = 0; i < word.length() ; i++) {
            char each = word.charAt(i);


              if (each >= '0' && each <= '9'){
                  if (each == 3) {
                  result += each;
              }

            }

        }
        System.out.println(result);
    }
}
/*
Use a loop to count the number of triples in the given str. A triple is when the same character appears three times in a row. So if there is a specific character that is repeated three times, that will be counted as one triple. Print the total number of triples found in the String. The triples may overlap.
Main topics: loops, primitive datatypes, operators, Scanner, String, if statements

Ex:
  Input:
    abcXXXabc

  Output:
    1

Copied!
Ex:
  Input:
    xxxabyyyycd

  Output:
    3

  -> the triples found are xxx yyy and another yyy
Ex:
  Input:
    java

  Output:
    0
 */