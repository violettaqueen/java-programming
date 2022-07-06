package selfPractice.Interface.CarTask;

public class CarShop {

    public static void main(String[] args) {

        Toyota toyota = new Toyota("Toyota", "Highlander",2016,25000,"White");
        Honda honda = new Honda("Honda", "Civic", 2019, 14000, "Blue");
        BMW bmw = new BMW("BMW", "X6", 2022, 65000, "Red");
        Audi audi = new Audi("Audi", "Q8", 2021, 55000, "Neon");
        Mercedes mercedes = new Mercedes("Mercedes", "600", 2020, 67000, "Beige");
        Tesla tesla = new Tesla("Tesla", "Sedan", 2021, 79000, "Pink");
        Nio nio = new Nio("Nio", "L12", 2020, 45000,"Metallic");

        System.out.println(toyota);
        System.out.println(honda);
        System.out.println(bmw);
        System.out.println(audi);
        System.out.println(mercedes);
        System.out.println(tesla);
        System.out.println(nio);

        toyota.drive();
        toyota.start();
        honda.drive();
        honda.start();
        bmw.drive();
        bmw.start();
        bmw.stop();
        audi.autoPark();
        audi.drive();
        audi.start();
        mercedes.autoPark();
        mercedes.drive();
        mercedes.start();
        tesla.autoPark();
        tesla.selfDrive();
        nio.autoPark();
        nio.selfDrive();

    }

}
