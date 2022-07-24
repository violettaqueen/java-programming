package day20_forEachLoop;

public class ForEachLoop { //to access all elements

    public static void main(String[] args) {

        int[] numbers = {10, 20, 30, 40, 50};

        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }

        for (int each : numbers) { //going to run depends on number of elements

            System.out.println(each);
        }
        System.out.println("--------------------------------------------------------");




    }

}
