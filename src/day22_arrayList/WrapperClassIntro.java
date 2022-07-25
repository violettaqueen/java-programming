package day22_arrayList;

public class WrapperClassIntro {

    public static void main(String[] args) {

        String str = "Java";


        int a1 = 10;
        Integer a2 = 10;

        System.out.println("-----------------------------------");

        int b1 = 100;
        Integer b2 = b1; // auto boxing

        double c1 = b1;
        long c2 = b1;

        Integer b3 = b1; //auto boxing
        //  Long b3 = (long)b1;
        //   Double b4 = b1;

        char ch = 'A';

        Character ch2 = ch; // Autoboxing

        double d1 = 5.5;

        Double d2 = d1; // Auto boxing

        System.out.println("-----------------------------------");

        Integer n1 = 20;

        int n2 = n1;  // unboxing
        //    long n3 = n1;
        //    double n4 =n1;

        Character e1 = 'Z';  // wrapper class to primitive

        char e2 =e1; // unboxing

        // int e3 = e1;
        // long e4 = e1;



    }

}
