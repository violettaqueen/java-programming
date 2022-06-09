package selfPractice;

import utilities.ArraysUtility;

import java.util.Arrays;

public class ReverseNameArray {

    public static void main(String[] args) {

        String[] names = {"Violetta Queen", "Oleksiy Melnichuk", "Diana Sagoyan", "Umran Ozman",
        "Adelina Abdykanyeva", "Ahmet Polat", "Bilal Ghani", "Boban Milosevich", "Ekaterina Sementieva",
        "Kramer Brown"};


        for (int i = 0; i < names.length; i++) {
            for (int j = names[i].length() - 1; j >= 0; j--) {
                System.out.print(names[i].charAt(j));
            }
            System.out.println();
        }




        }


    }

/*
create string array, and store the names of your  classmates (10)
            reverse each student names and print them in separate line
            	ex:
            		arr = {java, python, c#}
            		output:
        			avaJ
        			nohtyp
        			#c
 */