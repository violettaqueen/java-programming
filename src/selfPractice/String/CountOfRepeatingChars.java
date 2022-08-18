package selfPractice.String;

public class CountOfRepeatingChars {

    public static void main(String[] args) {

        String str = "aabcccddaaaa";

        String result = "";
        int count = 0;
        char temp = str.charAt(0);

        for (char each : str.toCharArray()){
            if( temp == each){
                count++;
            }else{
                result += "" + temp + count;
                temp = each;
                count = 1;
            }
        }

       result += "" + temp + count;
        System.out.println(result);





    }


}
 /*
        Write a method that compresses a string based on the count of repeated characters. aabcccddaaaa -->
         a2b1c3d2a4
  */