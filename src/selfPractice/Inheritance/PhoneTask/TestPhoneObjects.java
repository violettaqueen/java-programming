package selfPractice.Inheritance.PhoneTask;

public class TestPhoneObjects {

    public static void main(String[] args) {

        IPhone iPhone1 = new IPhone("IPhone12", "Large", 1000.5, "Pink");

        Samsung samsung1 = new Samsung("Galaxy S22", "Medium", 1200.8, "White");

        Nokia nokia1 = new Nokia("Brick", "Small", 500, "Black");

        iPhone1.call(911);
        samsung1.call(911);
        nokia1.call(911);


    }
}
