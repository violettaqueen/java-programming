package selfPractice.Encapsulation;

public class TestCircle {

    public static void main(String[] args) {

        Circle circle1 = new Circle(6);



        circle1.calcArea();
        circle1.perimeter();

        System.out.println(circle1.getRadius());
        System.out.println(circle1.calcArea());
        System.out.println(circle1.perimeter());
    }
}
