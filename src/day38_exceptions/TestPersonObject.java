package day38_exceptions;

public class TestPersonObject {

    public static void main(String[] args) {

        Person person1 = new Person("Nick", 34, 'M');

        System.out.println(person1);


        try {
            person1.setAge(-25);
        } catch (RuntimeException e) {
            e.printStackTrace();
        }
        System.out.println(person1);


    }


}
