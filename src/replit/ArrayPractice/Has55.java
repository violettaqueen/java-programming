package replit.ArrayPractice;

public class Has55 {

    public static void main(String[] args) {

        int[] nums = {1, 5, 5, 1, 1};
        int element = 5;
        boolean has55 = false;

        for (int each : nums) {
            for (int i = 0; i < nums.length; i++) {
                if(nums[i] == 5 && i+1 == 5 ){
                    has55 = true;
                }else{
                    has55= false;
                }



            }
        }


        System.out.println(has55);
    }
}





