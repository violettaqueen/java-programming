package selfPractice.ArrayPractice.day20_ArrayPractice;

public class EvenOddArray {

    public static void countEvenOddArray(int[] array){

        int evenCount = 0;
        int oddCount = 0;

        for (int eachNum : array) {

            if(eachNum %2 == 0){
                evenCount ++;
            }else{
                oddCount ++;
            }
        }
        System.out.println(evenCount);
        System.out.println(oddCount);
    }


}
/*
 Write a program that can count the even and odd number from an array of integers

			Note: MUST use for each loop
 */