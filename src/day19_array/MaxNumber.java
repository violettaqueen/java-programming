package day19_array;

public class MaxNumber {

    public static void main(String[] args) {

        int[] numbers = {100, 20, 500, 40,  -10, 30};

        int max = numbers[0]; //assume that first element is a max number
        // to compare elements, need a loop

        for (int i = 1; i < numbers.length; i++) { //i: 1,2,3,4,5

            if(numbers[i] > max){ // compare the element of array with current max number
                max = numbers[i]; // replace the current max number
            }

        }
        System.out.println("max = " + max);

        System.out.println("---------------------------------------------------------");

    }

}
