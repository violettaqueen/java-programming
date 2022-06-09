package day06_ifstatements;

public class MedianNumber {

    public static void main(String[] args) {

        int a = 20, b = 50, c = 10;

        boolean aIsMedian = (a > b && a < c ) || (a > c && a < b);
        System.out.println(aIsMedian);

        boolean bIsMedian = (b > c && b < a) || (b > a && b < c);
        System.out.println(bIsMedian);

        boolean cIsMedian = !aIsMedian && !bIsMedian;
        System.out.println(cIsMedian);

        if(aIsMedian){
            System.out.println(a + " is median number");
        }
        if(bIsMedian){
            System.out.println(b + " is median number");
        }
        if(cIsMedian){
            System.out.println(c + " is median number");
        }
    }


}
/*
1. Create a class named MedianNumber. write a program that can find the median number between three DIFFERENT given integers

		Ex:
                a = 10, b= 15, c = 20;

            Output:
                15 is the median number
 */