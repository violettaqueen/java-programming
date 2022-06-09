package day15_WhileLoop;

public class RemoveDuplicates {

    public static void main(String[] args) {

        String str = "aabbbcccc";

        String result = ""; // this string is declared because to store the "abc" output

        for (int i = 0; i < str.length(); i++) { //index numbers of str

            char each = str.charAt(i);  // each character of the String str

            if (!result.contains("" + each)) { //if the string result doesn't control the character of string str yet
                result += each; //then we will add the character to a string result
            }
// if the character is not contained yet in the new string, then we will add it to the new string
        }
        System.out.println(result);
    }

}
/*
3. Write a program that can remove the duplicated characters from the string

				Ex:
					str = "aabbbcccc"

					output:
						abc
 */