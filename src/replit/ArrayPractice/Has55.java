package replit.ArrayPractice;

public class Has55 {

    public static void main(String[] args) {

        int[] nums = {1, 5, 4, 1, 5};
        boolean has55 = true;

        for (int i = 0, j =5; i < nums.length; i++) {

            if(nums[i] == j && j == nums[i +1]){
                    has55= true;
                }else{
                    has55= false;
                }
            }
        System.out.println(has55);
        }

    }






