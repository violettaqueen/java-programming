package replit.ArrayPractice;

public class PrintUniqueNumbers {

    public static void main(String[] args) {

        int[] nums = {2, 5, 5, 6, 3, 6, 9, 34, 3};
        int unique = 0;

        for (int j = 0; j < nums.length-1; j++) {


            int num = nums[j];
            int frequency = 0;


            for (int i = 0; i < nums.length - 1; i++) {
                if (nums[i] == num) {
                    frequency++;
                }
            }
            if (frequency == 1) {
                unique += num;
            }
        }
        System.out.println(unique);
    }
}
