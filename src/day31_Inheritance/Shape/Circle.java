package day31_Inheritance.Shape;

public class Circle extends Shape_Parent{  //default constructor

    private double radius;


    public Circle(double radius) {
        setRadius(radius);
    }


    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return radius * radius * 3.14;
    }

    @Override
    public double perimeter() {
        return (3.14 * 2) * radius;
    }

    @Override
    public void draw() {
        super.draw();
        System.out.println("    *    ");
        System.out.println("  *   *  ");
        System.out.println("*       *");
        System.out.println("*       *");
        System.out.println("  *   *  ");
        System.out.println("    *    ");
    }

    @Override
    public String toString() {
        return  getClass().getSimpleName() + "{" +
                " name= '" + getName() + '\'' +
                " radius= '" + radius + '\'' +
                ", area= '" + area() + '\'' +
                ", perimeter= '" + perimeter() + '\'' +
                '}';
    }
}

