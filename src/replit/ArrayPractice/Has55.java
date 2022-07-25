package replit.ArrayPractice;

public class Has55 {

    public static void main(String[] args) {

        int[] nums = {1, 5, 5, 1, 9};
        boolean has55 = true;



            for (int i = 0; i < nums.length; i++) {
                if(nums[i] == 5 && nums[i+1] == 5){
                    has55 = true;
                }else {
                    has55 = false;
                }
            }
        System.out.println(has55);
        }


        }






