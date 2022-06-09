package lab07_classAndObject;

public class TestCarObjects {


    public static void main(String[] args) {

        Car car1 = new Car();

        /*
        car1.brand = "BMW";
        car1.year = 2022;
        car1.model = "X6";
        car1.color = "Red";
        car1.price = 50000;
        */

        car1.setInfo("BMW", "X6", "Red", 2022, 50000);


        System.out.println(car1);

        Car car2 = new Car();

        /*
        car2.brand = "Audi";
        car2.model = "Q8";
        car2.year = 2021;
        car2.price = 45000;
        car2.color = "Black";
        */

        car2.setInfo("Audi", "Q4", "Black", 2022, 45000);

        System.out.println(car2);

        Car car3 = new Car();
        car3.setInfo("Lexus", "GS350", "White", 2022,60000);

        System.out.println(car3);


    }



}
