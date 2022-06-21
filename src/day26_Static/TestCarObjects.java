package day26_Static;

public class TestCarObjects {

    public static void main(String[] args) {


        Car car1 = new Car("BMW");
        System.out.println(car1);

        Car car2 = new Car("Audi", "Q6");
        System.out.println(car2);

        Car car3 = new Car("Porche", "Panamera", 2023);
        System.out.println(car3);

        Car car4 = new Car("Bently", "Coupe", 2024, 120000);
        System.out.println(car4);

        Car car5 = new Car("Porche", "Cayenne", 2025, 110000, "red");
        System.out.println(car5);



    }
}
