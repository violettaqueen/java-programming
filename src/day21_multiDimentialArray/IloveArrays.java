package day21_multiDimentialArray;

public class IloveArrays {

    public static void main(String[] args) {

        String[][][][][][][][][][]  array = {{{{{{{{{{"I", "Love", "Arrays"}}}}}}}}}};

        for (String[][][][][][][][][] strings9 : array) {
            for (String[][][][][][][][] strings8 : strings9) {
                for (String[][][][][][][] strings7 : strings8) {
                    for (String[][][][][][] strings6 : strings7) {
                        for (String[][][][][] strings5 : strings6) {
                            for (String[][][][] strings4 : strings5) {
                                for (String[][][] strings3: strings4) {
                                    for (String[][] strings2 : strings3) {
                                        for (String[] strings1 : strings2) {
                                            for (String each : strings1) {
                                                System.out.print(each+" ");
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }

    }

}
/*
Given the following array:
		 String[][][][][][][][][][]  array = {{{{{{{{{{"I", "Love", "Arrays"}}}}}}}}}};

	 Write a program that can dispay each elements of the given array
 */