package day26_Static;

public class TestIphoneObjects {

    public static void main(String[] args) {

        IPhone iPhone = new IPhone("iPhone", "Black", 1000);

        System.out.println(iPhone.color);
        System.out.println(iPhone.model);
        System.out.println(iPhone.price);

        iPhone.printPhoneInfo();

        // call the static variable through the class!!!

        System.out.println(IPhone.brand); // not a good way
        System.out.println(IPhone.OS); // don't use
        IPhone.printOperatingSystem(); // not to use

        System.out.println(IPhone.OS); // use this, through the class
        System.out.println(IPhone.brand);
        System.out.println(IPhone.isExpensiveToFix);
        System.out.println(IPhone.hasBatter);

    }

}
