package day31_Inheritance.Shape;

public class TestShapeObjects {

    public static void main(String[] args) {

        Square square1 = new Square(4);

        square1.area();
        square1.draw();

        System.out.println(square1);

        Circle circle1 = new Circle(3);

        System.out.println(circle1);

        Rectangle rectangle = new Rectangle(7,3);

        rectangle.area();
        rectangle.perimeter();
        rectangle.draw();

        System.out.println(rectangle);

        Circle circle = new Circle(5);

        circle.draw();
        circle.area();
        circle.perimeter();

        System.out.println(circle);

    }
}
