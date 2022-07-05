package selfPractice.Loops;

public class Calculate {

    public static int sum(int num) {

        int sum = 0;
        for (int i = 1; i <= num; i++) {
            sum += i;
        }
        return sum;

    }

    public static void main(String[] args) {
        System.out.println(sum(100));
    }
}
/*
 write a program that can calculate the sum of all numbers between 1 to any given number
            ex:
                input: 100
                output: 5050

                input: 50
                output: 1275
 */