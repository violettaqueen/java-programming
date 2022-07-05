package lab_days.lab07_classAndObject;

public class TestAddressObjects {

    public static void main(String[] args) {
        //reference variable
        Address address1 = new Address();
        Address address2 = new Address();
        Address address3 = new Address();

        address1.setInfo("8888", "Tappy Toorie Cir", "Highlands Ranch", "Colorado", "80129");
        address2.setInfo("9019", "Yosemite st", "Lone Tree", "Colorado", "80124");
        address3.setInfo("1234", "Main Street", "Littleton","Colorado", "80127");


        System.out.println(address1);

        System.out.println("-----------------------------------------------------------------------");
        System.out.println(address2);
        System.out.println("-----------------------------------------------------------------------");
        System.out.println(address3);

        System.out.println("------------------------------------------------------------------------");

        new Car(); // object has to have a reference name

    }

}
