package selfPractice.ArrayPractice.day20_ArrayPractice;

public class UniqueElementsArray {

    public static void main(String[] args) {

         String [] array = { "Anna", "Anna", "Violetta"};
         String unique = "";

        for (String eachElement : array) {
            unique += eachElement;

            if(!(unique.equals(eachElement) )){
                unique = eachElement;
            }
        }
        System.out.println(unique);
    }
}
/*
Write a program that can display the unique elements of an array

			MUST use for each loops
 */