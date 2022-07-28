package utilities;

public class MathUtility {

    public static double factorial(double num){

        double factorial = 1;

        for (int i =(int) num; i >= 1; i--) {

            factorial *= i;
        }
        return factorial;
    }
    public static void next3(int num) {

        for (int i = 0, j = num; i < 3; i++, j++) { // i --> number of times to repeat
            System.out.print(j + 1 + " ");
        }
    }



}
