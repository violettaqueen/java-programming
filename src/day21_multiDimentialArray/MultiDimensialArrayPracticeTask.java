package day21_multiDimentialArray;

import java.util.Arrays;

public class MultiDimensialArrayPracticeTask {

    public static void main(String[] args) {

        String[][] items = { //2DArray
                {"Apple", "Banana", "Grape", "Avocado"},
                {"Paper Towels", "Toilet Papers", "Tissues", "Diapers"},
                {"Coke", "Fanta", "Arizona Tea", "Pepsi", "Water"}
        };

        for (String[] each1D : items) {
            for (String eachElements : each1D) {
                System.out.print("\t"+eachElements +"\t");
            }
        }

            }
        }

        /*System.out.println();

        System.out.println("--------------------------------------------------------------------");

        for (int i = items.length - 1; i >= 0; i--) {
            for (int j = items.length - 1; j >= 0; j--) {
                System.out.print(items[i][j] + "\t");
            }
        }
        System.out.println();
        System.out.println("-------------------------------------------------------------------------");
        for (int i = items.length - 1; i >= 0; i--) {
            for (int j = 0; j < items.length; j++) {
                System.out.print(items[i][j]+"\t");
            }
        }*/






/*
Given the Array:
		String[][] items = {
					{"Apple", "Banana", "Grape", "Avocado"},
					{"Paper Towels", "Toilet Papers", "Tissues", "Diapers"},
					{"Coke", "Fanta", "Arizona Tea", "Pepsi", "Water"}
					};

		1. print the following output: (add \t between two words)
				Apple    Banana   Grape    Avocado
				Paper Towels     Toilet Papers   Tissues    Diapers
				Coke   Fanta   Arizona Tea   Pepsi   Water

		2. print the following output: (add \t between two words)
				Avocado   Grape    Banana    Apple
				Diapers   Tissues   Toilet Papers   Paper Towels
				Water    Pepsi    Arizona Tea    Fanta   Coke

		3. print the following output: (add \t between two words)
				Coke   Fanta   Arizona Tea   Pepsi   Water
				Paper Towels     Toilet Papers   Tissues    Diapers
				Apple    Banana   Grape    Avocado
 */