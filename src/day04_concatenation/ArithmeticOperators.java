package day04_concatenation;

public class ArithmeticOperators {

    public static void main(String[] args) {

        System.out.println(100 + 200); // 300
        System.out.println(40 - 10); // 30

        System.out.println(50 / 6);
        System.out.println(50 / 6.0);
        System.out.println(50.0 / 6);
        System.out.println( (int) (2.5 / 0.5));

        System.out.println( 20 * 12);

        // Modulus

        // 10 /3 = 3.321231....
        // remainder = numerator - (denominator * integer result)
        // 10 - (3 * 3) = 1

        // 20 / 6 = 20 - (6 * 3) = 2
        // 15 / 4 = 15 - (4 * 3) = 3
        // 10 % 3 = 1
        // 20 % 6 = 2
        // 15 % 4 = 3

        System.out.println(100 % 13);
        System.out.println(45 % 8);



    }

}
