package day19_array;
import java.util.Arrays;

public class ArraysIntro {

    public static void main(String[] args) {

        int score1 = 85;
        int score2 = 75;
        int score3 = 78;
        int score4 = 88;
        int score5 = 95;

        int[] scores = new int[5]; //declare an array variable //index 0-4
                        // must contain 5 elements
        scores[2] = 78;
        scores[0] = 85;
        scores[1] = 75;
        scores[3] = 88;
        scores[4] = 95;


        // you can reassign a variable to a new object:
        // scores = new int[49];

        System.out.println(  Arrays.toString(scores)  );

        System.out.println("----------------------------------------------------------------------------------------");

        System.out.println(scores[2]);

        System.out.println("-----------------------------------------------------------------------------------------");

        // if you want to print all the elements

        for (int i = 0; i < 5; i++) {  //i: index number of Array
            System.out.println(scores[i]);
        }
        System.out.println("------------------------------------------------------");

        for (int i = 0; i < scores.length; i++) { //length is a variable of Array

        }

        System.out.println( scores[scores.length-1]);
    }

}
