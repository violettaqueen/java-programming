package utilities;

public class WrapperClassUtility {

    public static int sumOfDigitsInString(String str){
        int sum = 0;
        for (char each : str.toCharArray()){

            if(Character.isDigit(each)){
                sum += Integer.parseInt(each + "");
            }
        }
        return sum;
    }
}
