package replit.StringPractice.Loops;

public class CountTriplets {

    public static void main(String[] args) {

        String str = "abcXXXabc";

        int count = 0 ;

        for (int i = 0; i < str.length()-2; i++) {
            char each = str.charAt(i);

            if (each == str.charAt(i+1)&& each== str.charAt(i+2)){
                count++;
            }
        }
        System.out.println(count);



    }
}
/*
Use a loop to count the number of triples in the given str. A triple is when the same character appears three times in a row. So if there is a specific character that is repeated three times, that will be counted as one triple. Print the total number of triples found in the String. The triples may overlap.
Main topics: loops, primitive data types, operators, Scanner, String, if statements

Ex:
  Input:
    abcXXXabc

  Output:
    1
Ex:
  Input:
    xxxabyyyycd

  Output:
    3

  -> the triples found are xxx yyy and another yyy

Copied!
Ex:
  Input:
    java

  Output:
    0
 */