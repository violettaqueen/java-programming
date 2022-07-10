package day36_polymorphism;

public class TestEqualMethod {

    public static void main(String[] args) {

        IPhone iphone1 = new IPhone("Apple", "IPhone12", "Medium", "Black", 1000);
        IPhone iphone2 = new IPhone("Apple", "IPhone12", "Medium", "Blue", 1200);

        System.out.println(iphone1.equals(iphone2));
    }
}
