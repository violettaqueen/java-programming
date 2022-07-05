package utilities;

public class MathUtility {

    public static double factorial(double num){

        double factorial = 1;

        for (int i =(int) num; i >= 1; i--) {

            factorial *= i;
        }
        return factorial;
    }



}
