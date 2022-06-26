package selfPractice.Encapsulation;

public class Credentials {

    private String userName;
    private String password;

    public Credentials(String userName, String password) {
        setUserName(userName);
        setPassword(password);
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {

        if (!isStrongPassword(password)) {
            System.err.println("Password is not strong!");
            System.exit(1);
        }

        this.password = password;
    }

    public boolean isStrongPassword(String password) {

       boolean hasSpecialChar = false, hasLetter = false, hasDigit = false;


        for (char each : password.toCharArray()) {

            if (!Character.isLetterOrDigit(each)) {
                hasSpecialChar = true;
            } else if (Character.isLetter(each)) {
                hasLetter = true;
            } else if (Character.isDigit(each)) {
                hasDigit = true;
            }

        }
        if (password.length() >= 8 && !password.contains(" ") &&
        hasSpecialChar && hasDigit && hasLetter){
            return true;
        }else{
            return false;
        }
    }

    public String toString() {
        return "Credentials {" +
                "userName = '" + getUserName() + '\'' +
                ", password = '" + getPassword() + '\'' +
                '}';
    }
}










/*
create a class named Credentials
            Variables:
                username, password

            Encapsulate all the fields
                    (password MUST be a strong password)


            Add a constructor that allows user to set all the fields when the object is created.
                        (If the arguments not valid it should not be set to the instances)

            Methods:
                isStrongPassWord(): takes an argument of string and verify if the given string is strong password, returns boolean
                            Characteristics of strong passwords are:
                                    1. Password MUST be at least have 8 characters long, and should not contain space
                                    2. PassWord should at least contain one letter
                                    3. Password should at least contain one special characters
                                    4. Password should at least contain a digit

                toString()
 */