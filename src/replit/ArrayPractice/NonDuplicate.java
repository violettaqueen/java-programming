package replit.ArrayPractice;

public class NonDuplicate {

    public static void main(String[] args) {

        int[] nums = {1, 2, 3, 4, 3, 4, 1};

        int nonDup = 0;

        for (int i = 0; i < nums.length; i++) {
           nonDup = nums[i];
        }
        if (nonDup == 1){
            System.out.println(nonDup);
        }


    }
}
