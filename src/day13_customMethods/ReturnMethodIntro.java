package day13_customMethods;

public class ReturnMethodIntro {

    public static void main(String[] args) {

       // int total = sum(20, 40); // sum is a void method, does not return any date
        int total = sum(10,20);

        square(10);
        System.out.println(square(10));

        System.out.println(cube(5)); //you can print a date or
        int r = cube(5);             // assign it to a variable
    }

    /*public static void sum(int n1, int n2){

        int result = n1 + n2;
        */

    public static int sum (int n1, int n2){
        int result = n1 + n2;
        return result;


    }

    public static int square(int num) {

        int square = num * num;
        return square;
    }

        public static int cube(int num){
            int cube = square(num) * num; // int cube = square(num) +num;
            return cube;
        }

    }

