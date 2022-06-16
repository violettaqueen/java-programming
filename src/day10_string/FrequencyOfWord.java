package day10_string;

import java.util.Scanner;

public class FrequencyOfWord {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();

        int countCat = 0;
        int countDog = 0;

        for (int i = 0; i < str.length()-3; i++) {
            String each = str.substring(i, i+3);
            if(str.equals("cat")){
                countCat++;
            }
            if(str.equals("dog")){
                countDog++;
            }


        }
        if(countCat==countDog){
            System.out.println(true);
        }else{
            System.out.println(false);
        }

    }
}
/*
Use a loop to count how many times the characters cat and dog are found in the given String str.
Output true if cat and dog appear the same number of times, otherwise output false
Main topics: loops, primitive datat ypes, operators, Scanner, String, if statements
 */