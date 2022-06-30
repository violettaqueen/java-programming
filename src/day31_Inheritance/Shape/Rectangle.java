package day31_Inheritance.Shape;

public class Rectangle extends Shape_Parent{

    public Rectangle(double side) {
        setSide(side);
    }

    private double side;

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public double area() {
        return super.area();
    }

    @Override
    public double perimeter() {
        return super.perimeter();
    }

    @Override
    public void draw() {
        super.draw();
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
