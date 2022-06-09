package day12_customMethods;

public class CustomMethodsPractice {

    public static void main(String[] args) {

maxNumber(6,2);
maxNumber(10.5, 500);
initial("Cydeo", "School");
initial("Violetta", "Queen");
initial("Jon", "Queen");

    }
   public static void maxNumber(double num1, double num2){   //use multi branch

        if(num1 > num2){
            System.out.println(num1 + " is a maximum number");
        } else if (num2 > num2) {
            System.out.println(num2 + " is a maximum number");
        }else{
            System.out.println("Equal");
        }

   }
public static void initial(String firstName, String lastName){

        String initial = firstName.charAt(0) + "." + lastName.charAt(0);

    System.out.println("Initial is: " + initial);
}
}
