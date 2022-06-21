package day26_Static;

public class IPhone {

    public static String brand = "Apple"; // all the Iphone objects brand has the same name "Apple";
    public String model, color; // instance: different models
    public double price;
    public static String OS = "iOS";
    public static String madeIn = "China";
    public static boolean hasBatter = true;
    public static boolean isTouchscreen = true;
    public static boolean isExpensiveToFix = true;

    public IPhone(String model, String color, double price) {
        this.model = model;
        this.color = color;
        this.price = price;
    }

    // create methods: instance vs static

    public void printPhoneInfo(){  //instance method, need objects
        System.out.println("Brand: " + brand);
        System.out.println("Color: " + color );
        System.out.println("Model: " + model );
        System.out.println("Price: " + price );
    }
    public static void printOperatingSystem(){ //it doesn't depend on object
        System.out.println("Operating System: " + OS);
    }

    public String toString() {
        return "IPhone{" +
                "model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", price=" + price +
                '}';
    }
}
/*
Attributes:
brand(static), model, color, price, OS(static -one copy can be created), madeIn, hasBattery, isTouchScreen, isExpensiveToFix
 */