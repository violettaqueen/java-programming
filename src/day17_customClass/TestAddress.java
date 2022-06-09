package day17_customClass;

public class TestAddress {

    public static void main(String[] args) {

        Address address1 = new Address();

        address1.buildingNumber = "8888";
        address1.street = "Tappy Toorie Cir";
        address1.city = "Highlands Ranch";
        address1.state = "Colorado";
        address1.zipCode = "80129";

        System.out.println(address1);
    }

}
