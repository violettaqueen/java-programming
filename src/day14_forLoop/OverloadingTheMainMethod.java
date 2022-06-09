package day14_forLoop;

public class OverloadingTheMainMethod { //no point to overload the main method

    public static void main(String[] args) {
        System.out.println("A");
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
}
