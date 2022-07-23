package replit.ArrayPractice;

public class CountAppearance {

    public static void main(String[] args) {

       String[] arr = {"a","foo","bar","foo","bla"};
       String word = "foo";

       int count = 0;

        for (int i = 0; i < arr.length; i++) {
            if(arr[i].equals("foo")){
                count+=1;
            }
        }
        System.out.println(count);
    }
    public static int countAppearance(String[] arr, String word){
         int countAppearance = 0;

        for (int i = 0; i < arr.length; i++) {
            if(arr[i].equals(word)){
                countAppearance +=1;
            }
        }
        return countAppearance;
    }
}
/*
Finish the method called countAppearance() that will take String [] and String arguments and return an int for the number
of times the given String word is found in the given String [] arr.
This is a return method with String[] and String parameters
Main topics: methods, Scanner, loops, String, arrays, primitive datatypes, operators, if statements

Example:

arr = ["a","foo","bar","foo","bla"];
  countAppearance(arr, "foo")

output:
  2
Example:

arr = ["a","foo","bar","foo","bla"];
  countAppearance(arr, "bla")

output:
  1

Copied!
Example:

arr = ["a","foo","bar","foo","bla"];
  countAppearance(arr, "java")

output:
  0
 */