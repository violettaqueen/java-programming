package selfPractice.ReturnMethods;

public class ClassLunchTasks {

    public static void main(String[] args) {

      boolean isEven =  isEven(7);
        System.out.println(isEven);

        boolean isOdd = isOdd(9);
        System.out.println(isOdd);




    }

    public static boolean isOdd(int num){
        return (num %2 != 0)? true : false;
    }
    public static boolean isEven(int num){
        return !isOdd(num);
    }
    public static int maxNumber(int num1, int num2){
        if (num1 > num2){
            return num1;
        }else{
            return num2;
        }
    }
    public static int minNumber(int num1, int num2){
        if (num1 < num2){
            return num1;
        }else{
            return num2;
        }
    }
}
/*
/*
Create a method named isOdd, that can return true if a number is an odd number
Create a method named isEven, that can return true if a number is an even number
Create a method named max, that can return the maximum number between two numbers
Create a method named min, that can return the minimum number between two numbers
 */
