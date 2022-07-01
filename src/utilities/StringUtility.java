package utilities;

public class StringUtility {

    public static String reverse(String str) {
        String reverse = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            reverse += str.charAt(i);
        }

        return reverse;
    }

    public static void initials(String firstName, String lastName) {

        firstName = firstName.substring(0, 1).toUpperCase();
        lastName = lastName.substring(0, 1).toUpperCase();
        System.out.println(firstName + "." + lastName + ".");
    }

}
