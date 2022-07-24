package replit.methods;

public class MethodOverloading {

    public static int findMax(int[] num) {

        int max = 0;

        for (int i = 0; i < num.length; i++) {
            if (num[i] > max) {
                max = num[i];
            }

        }
        return max;
    }
        public static double findMax(double[] num) {

            double max = 0.0;

            for (int i = 0; i < num.length; i++) {
                if(num[i] > max){
                     max =num[i];
                }
            }
        return max;

    }

    public static void main(String[] args) {
        int[] array = {1,2,3,5};

        System.out.println(findMax(array));
    }
    }


/*
In this task, you need to write 2 overloaded methods findMax() that will find a maximum
number in the array. First version should work with array of integers (int[]) and return int,
 and second method should work with an array of doubles (double[]) and return double as a result.

Methods must have the same name and different parameters.
 */