package selfPractice.Different;

public class OddOrEven {

    public static void main(String[] args) {
        int n = 20;

        for (int i = 1; i <= n; i++) {

            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.print("\n");
        for (int m = 1; m <= n; m++) {

            if (m % 2 != 0) {
                System.out.print(m + " ");
            }
        }
    }
}

