package day14_forLoop;

public class OverloadingTheMainMethod { //no point to overload the main method

    public static void main(String[] args) {
        System.out.println("A");

      /*
        main(25); // B
        main(2.05); //C
        main(true); //D

       */
    }

    public static void main(int[] args) {
        System.out.println("B");
    }

    public static void main(double[] args) {
        System.out.println("C");
    }

    public static void main(int[] args, int a) {
        System.out.println("D");
    }

    public static void main(boolean[] args) {
        System.out.println("F");
    }
}
