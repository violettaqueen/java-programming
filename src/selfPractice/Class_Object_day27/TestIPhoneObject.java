package selfPractice.Class_Object_day27;

public class TestIPhoneObject {

    public static void main(String[] args) {

        IPhone phone1 = new IPhone("MaxPro12", "256GB", "Pink", 1200,"Italy");


        System.out.println(phone1);
        System.out.println("Call number: " + phone1.call(2343456532L));
        System.out.println("Text number: " + phone1.text(234567685L));
        System.out.println("Face Time phone number: " + phone1.faceTime(1234563242l));
        System.out.println("Face Time email: " + phone1.faceTime("apple@gmail.com"));

    }
}
