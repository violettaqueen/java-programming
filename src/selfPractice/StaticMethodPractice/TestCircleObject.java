package selfPractice.StaticMethodPractice;

public class TestCircleObject {

    public static void main(String[] args) {

        // 1. Create an object
        // 2. Set the radius

        Circle circle1 = new Circle(3.5); // because we don't have a default constructor, that's why we have a parameter to provide

        System.out.println(circle1);

        Circle circle2 = new Circle(5);

        System.out.println(circle2);

        // do not call static through the object but call it through class name

        System.out.println(Circle.pi);

        // instances can not be called through the class because instance belongs to an object

    }
}
