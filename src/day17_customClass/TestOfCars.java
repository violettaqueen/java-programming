package day17_customClass;

public class TestOfCars {

    public static void main(String[] args) {

        Cars car1 = new Cars();
        car1.setInfo("BMW", 2022, "Red", "four - wheel drive", 1000);

        Cars car2 = new Cars();
        car2.setInfo("Mercedec", 2021, "Blue", "Full wheel drive", 600);

        Cars car3 = new Cars();
        car3.setInfo("Audi", 2023, "Orange", "Four wheel drive", 400);



        System.out.println(car1);
        System.out.println(car2);
        System.out.println(car3);
    }

}
