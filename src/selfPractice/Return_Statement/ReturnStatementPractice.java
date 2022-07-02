package selfPractice.Return_Statement;

public class ReturnStatementPractice {

    public static void main(String[] args) {

        System.out.println(combine("one", "eight"));

        System.out.println(sum(2,2,2));
    }

    public static String combine(String word1, String word2){

        if (word1.toLowerCase().charAt(word1.length()-1) == word2.toLowerCase().charAt(0)){
            return word1 + word2.substring(1);
        }
        return word1.toLowerCase() + word2;
    }
    public static int sum(int num1, int num2){
        int sum = num1 + num2;
        return sum;
    }
    public static int sum(int num1, int num2, int num3){
        int sum = sum(num1, num2) + num3;
        return sum;
    }
    public static int sum(int num1, int num2, int num3, int num4){
        int sum = sum(num1, num2, num3)+num4;
        return sum;
    }

}
/*
Task1:
    Create a method named combine that can take two string and hen add them together and returns it.
        But if the last letter of the first word and the first letter of the last letter are the same,
        return that character once.

        combine("one", "eight")  ==> oneight

Task 2:
    1. create a method that can find the sum of two integer numbers
                method name: sumOf2Numbers

    2. create a method that can find the sum of three integer numbers
                method name: sumOf3Numbers

    3. create a method that can find the sum of four integer numbers
                method name: sumOf4Numbers
 */