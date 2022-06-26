package selfPractice.Encapsulation;

public class TestCredentials {

    public static void main(String[] args) {

        Credentials credentials1 = new Credentials("violetta12!", "123hell!");

        credentials1.getUserName();
        credentials1.getPassword();



        System.out.println(credentials1);

    }
}
