package day31_Inheritance.Shape;

public class TestShapeObjects {

    public static void main(String[] args) {

        Square square1 = new Square(4);

        square1.area();
        square1.draw();

        System.out.println(square1);


        Circle circle1 = new Circle(3);

        System.out.println(circle1);
    }
}
