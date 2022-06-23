package selfPractice.Encapsulation;

public class TestSquare {

    public static void main(String[] args) {

        Square square1 = new Square(-1);

        square1.getSide();
        square1.calArea();
        square1.calcPerimeter();

        System.out.println(square1);
    }
}
