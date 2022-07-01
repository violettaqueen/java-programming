package selfPractice.MethodOverriding.CarTask_method_Overriding;

public class TestCarObjects {

    public static void main(String[] args) {

   Toyota toyota1 = new Toyota("Camry","Blue",2018,23000);

   Honda honda1 = new Honda("Accord","White",2020,24000);

        Audi audi = new Audi("Q6", "Silver", 2021, 50000);

        BMW bmw = new BMW("X6", "Black", 2017, 45000);

        Tesla tesla = new Tesla("Model 3", "White", 2022, 65000);

        System.out.println(toyota1);
        System.out.println(honda1);
        System.out.println(audi);
        System.out.println(bmw);
        System.out.println(tesla);

        System.out.println("------------------------------------------------------");

        toyota1.start();
        honda1.start();
        audi.start();
        bmw.start();
        tesla.start();

        System.out.println("------------------------------------------------------");

        // tesla.setPrice(30000);
        // tesla.setModel("Model H");

        System.out.println(tesla);

    }
}
