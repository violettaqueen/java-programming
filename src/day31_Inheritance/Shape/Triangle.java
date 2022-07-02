package day31_Inheritance.Shape;

public class Triangle extends Shape_Parent {

    private double height, side1, side2, base;

    public Triangle(double height, double side1, double side2, double base) {
        setLength(height);
        setSide1(side1);
        setSide2(side2);
        setBase(base);
    }

    public double getLength() {
        return height;
    }

    public void setLength(double length) {
        this.height = length;
    }

    public double getSide1() {
        return side1;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public double getSide2() {
        return side2;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    @Override
    public double area() {
        return (base * height) / 2;
    }

    @Override
    public double perimeter() {
        return side1 + side2 + base;
    }

    @Override
    public void draw() {
        super.draw();
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();

        }

    }

    @Override
    public String toString() {
        return  getClass().getSimpleName() + "{" +
                " name= '" + getName() + '\'' +
                " base= '" + base + '\'' +
                " side 1= '" + side1 + '\'' +
                " side 2= '" + side2 + '\'' +
                ", area= '" + area() + '\'' +
                ", perimeter= '" + perimeter() + '\'' +
                '}';
    }
}
