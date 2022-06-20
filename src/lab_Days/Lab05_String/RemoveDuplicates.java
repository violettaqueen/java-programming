package lab_Days.Lab05_String;

public class RemoveDuplicates {

    public static void main(String[] args) {

        String str = "xyzxyzxyz";
        String result = "";

        for (int i = 0; i < str.length(); i++) {
            //from first char to the last char
            char each = str.charAt(i);

            //if(result.indexOf(each) < 0) {
            if (!result.contains("" + each)) {
                result += each;
            }
        }

        System.out.println(result);
    }
}

