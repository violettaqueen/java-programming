package day14_forLoop;

public class SumOfTwoIntegerNumbers {
    public static void main(String[] args) {
        sumOfTwoIntegerNumbers(10,20);
        System.out.println(sumOfTwoIntegerNumbers(10,20));
        System.out.println(sumOfFourIntegerNumbers(4, 30, 50, 2));
    }

    public static int sumOfTwoIntegerNumbers(int n1, int n2){
        return n1 + n2;

    }
public static int sumOfThreeIntegerNumbers(int n1, int n2, int n3){
        //return n1 + n2 + n3;
    return sumOfTwoIntegerNumbers(n1,n2) + n3;
}
public static int sumOfFourIntegerNumbers (int n1, int n2, int n3, int n4){
       // way: return sumOfThreeIntegerNumbers(n1,n2,n3) + n4;
        return sumOfTwoIntegerNumbers(n1,n2) + sumOfTwoIntegerNumbers(n3, n4);
}

}
/*
Task 2:
	    1. create a method that can find the sum of two integer numbers
	                method name: sumOf2Numbers
	    2. create a method that can find the sum of three integer numbers
	                method name: sumOf3Numbers
	    3. create a method that can find the sum of four integer numbers
	                method name: sumOf4Numbers

 */