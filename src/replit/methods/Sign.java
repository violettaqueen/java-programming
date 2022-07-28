package replit.methods;

public class Sign {

    public static void sign(int n) {

        String result = "";

        if (n > 0) {

            result = "positive";

        } else if (n < 0) {

            result = "negative";

        } else {

            result = "zero";
        }

        System.out.println(result);
    }

    public static void main(String[] args) {

        sign(0);
    }
}