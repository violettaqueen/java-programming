package day21_multiDimentialArray;

import java.util.Arrays;

public class MultiDimentionalArrayPractice {

    public static void main(String[] args) {

        String[] group1 = {"James", "Daniel", "Kadifa", "Muhtar"};
        String[] group2 = {"Violetta", "Nathan", "Jon"};
        String[] group3 = {"Liza", "Elizabeth", "Betty", "Lizzie", "Liz"};
        String[] group4 = {"Jon", "Nathan"};

        String [][] groups = {group1, group2, group3, group4};  // 2 dimensional
                            // 0        1       2        3

        for (int i = 0; i < groups.length; i++) {
            String[] eachGroup = groups[i];
            System.out.println(Arrays.toString(eachGroup));

            for (int j = 0; j < eachGroup.length; j++) { //j: is index num of each student
                String eachStudent = eachGroup[j];
                System.out.println(eachStudent);

            }
        }
        System.out.println("--------------------------------------------------------------------------");

        // for each loop
        for (String[] eachGroup : groups) {
            System.out.println(Arrays.toString(eachGroup));
            for (String eachStudent : eachGroup) {
                System.out.println(eachStudent);
            }

        }
        System.out.println("-------------------------------------------------------------------------------");

        // reverse order:

        for (int i = groups.length - 1; i >= 0; i--) {
          String[] eachGroup = groups[i];
            System.out.println(Arrays.toString(eachGroup));

            for (String eachStudent : eachGroup) {
                System.out.println(eachStudent);
            }

        }
        System.out.println("-----------------------------------------------------------------------");

       // System.out.println(groups);

       // System.out.println( Arrays.toString(groups)); // toString() ==> for single dimensional arrays ONLY

        System.out.println( Arrays.deepToString(groups) ); // deepToString() ==> for multi-dimensional dimensional arrays ONLY





    }


}
