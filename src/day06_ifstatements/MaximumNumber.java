package day06_ifstatements;

public class MaximumNumber {

    public static void main(String[] args) {

        int n1 = 1000;
        int n2 = 200;

        if (n1 > n2) {
            System.out.println(n1 + " is a maximum number");
        }
        if (n2 > n1) {
            System.out.println(n2 + " is a maximum number");
        }
        if (n1 == n2) {
            System.out.println("Equal");
        }

    }

}
