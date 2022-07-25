package replit.ArrayPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class PrintUniqueNumbers {

    public static void printUniqueNumbers(int[]num){

        //numbers.removeIf(p -> Collections.frequency(numbers, p) != 1);
        int unique = 0;
        String result = "";

        for (int eachNum : num) {


            if(!(unique == eachNum)){
                unique += eachNum;
                result += unique;
            }
        }
        System.out.println(result);
    }

    public static void main(String[] args) {

        int[]nums = {2, 5, 5, 6, 3, 6, 9, 34, 3};

        System.out.println(Arrays.toString(nums));


    }
        }
/*
Finish the method called printUniqueNumbers() that will take anint [] and print out all of the unique numbers in the array.
 A number is unique when it is only found in the array one time.
This is a void method with an int [] parameter
Main topics: methods, Scanner, loops, arrays, primitive datatypes, operators, if statements

Example:

nums = [2, 5, 5, 6, 3, 6, 9, 34, 3];
  printUniqueNumbers(nums)

output:
  2
  9
  34
Example:

nums = [4, 5, 11, 5, 6, 1, 4];
  printUniqueNumbers(nums)
  output:
  11
  6
  1
 */

