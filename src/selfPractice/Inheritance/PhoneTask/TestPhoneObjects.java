package selfPractice.Inheritance.PhoneTask;

public class TestPhoneObjects {

    public static void main(String[] args) {

        IPhone iPhone1 = new IPhone("IPhone12", "Large", 1000.5, "Pink");

        Samsung samsung1 = new Samsung("Galaxy S22", "Medium", 1200.8, "White");

        Nokia nokia1 = new Nokia("Brick", "Small", 500, "Black");

        iPhone1.call(911);
        samsung1.call(911);
        nokia1.call(911);


        iPhone1.text(123456789);
        samsung1.text(123456789);
        nokia1.text(123456789);

        System.out.println("-------------------------------");

        iPhone1.faceTime(123456789);
        // samsung.faceTime(123456789);
        // nokia.faceTime(123456789);

        samsung1.freeze();
        // iphone.freeze();
        //  nokia.freeze();

        nokia1.selfDefence();
        //   iphone.selfDefense();
        //   samsung.selfDefense();

        System.out.println(iPhone1);
        System.out.println(samsung1);
        System.out.println(nokia1);


    }
}
