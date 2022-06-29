package replit.StringPractice.Loops;

public class CountTriplets {

    public static void main(String[] args) {

        String word = "xxxabyyyycd";
        int count = 0;

        for (int i = 0; i < word.length(); i++) {
            char each = word.charAt(i);



            if (each>3){
                each ++;
            }else{
                System.out.println(0);
            }
            System.out.println(count);
        }


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