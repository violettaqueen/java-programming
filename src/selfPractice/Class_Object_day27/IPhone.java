package selfPractice.Class_Object_day27;

public class IPhone {
    public static String brand;
    public String model, size, color;
    public double price;
    public static String OS;
    public static boolean isSmartPhone;
    public static String madeIn;
    public String designedIn;

    public IPhone(String model, String size, String color, double price, String designedIn) {
        this.model = model;
        this.size = size;
        this.color = color;
        this.price = price;
        this.designedIn = designedIn;
    }

    static {
        OS = "IOS";
        brand = "Apple";
        isSmartPhone = true;
        madeIn = "China";
    }

    public static void printOperatingSystem() {
        System.out.println("Operating system is: " + OS);
    }

    public long call(long phoneNumber) {
       return phoneNumber;
    }

    public long text(long phoneNumber) {
        return phoneNumber;
    }

    public long faceTime(long phoneNumber) {
        return phoneNumber;
    }

    public String faceTime(String email) {
        return email;
    }

    public String toString() {
        return "IPhone{" +
                "model='" + model + '\'' +
                "brand ='" + brand + '\'' +
                ", Operation system ='"  + OS + '\'' +
                ", size='" + size + '\'' +
                ", color='" + color + '\'' +
                ", price=" + price +
                ", designedIn='" + designedIn + '\'' +
                ", made in='" + madeIn + '\'' +
                '}';
    }
}
/*
Create a class named Iphone
            variables:
                brand, model, size, color, price, OS, isSmartPhone, madeIn, designedIn

            Add a constructor to initialized all the fields

            Add a static block to initialize all the statics

            Methods:
                printOperatingSystem(): displays the operating system of the iphone
                call(long phoneNumber)
                text(long phoneNumber)
                faceTime(long phoneNumber)
                faceTime(String email)
                toString()

 */