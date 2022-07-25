package selfPractice.ArrayPractice.day20_ArrayPractice;

public class CountPalindromes {

    public static void main(String[] args) {

        String[] array = {"anna", "level", "Java"};

        int count = 0;


        for (String each : array) {
            String reverse = "";
            for (int i = each.length() - 1; i >= 0; i--) {
                reverse += each.charAt(i);

                }
            if (each.equals(reverse)) {
                count ++;
            }

        }
        System.out.println(count);
    }
}
/*
write a program that can count how many palindromes in an array of string
        Ex:
            {"anna", "level", "Java"};

            output:
                2
 */