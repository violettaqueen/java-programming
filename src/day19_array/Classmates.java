package day19_array;

import java.util.Arrays;

public class Classmates {

    public static void main(String[] args) {

        String[] classmates = new String[10];

        classmates[0] = "Violetta Queen";
        classmates[1] = "Nathan Bolema";
        classmates[2] = "Jon Queen";
        classmates[3] = "Elizabeth Queen";
        classmates[4] = "Sergey Alekseev";
        classmates[5] = "Vlad Aleksandrov";
        classmates[6] = "Olga Rusina";
        classmates[7] = "Hajime Sato";
        classmates[8] = "Sofia Badurashvli";
        classmates[9] = "Vilya Abdushayev";

        for (String each : classmates) {
            System.out.println(each.charAt(0) + "." + each.charAt(each.lastIndexOf(" ")+1));
        }

    }

}
/*
1. create an array named classmates, and store 10 of your classmates' full names
            print the initials of each classmate in separate lines

 */