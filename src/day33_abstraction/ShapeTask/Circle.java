package day33_abstraction.ShapeTask;

public final class Circle extends Shapes {

    private double radius;
    public static double pi;
    static {
        pi = 3.14;
    }

    public Circle(String name, double radius) {
        super(name);
       setRadius(radius);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public static double getPi() {
        return pi;
    }

    public static void setPi(double pi) {
        Circle.pi = pi;
    }

    @Override
    public double area() {
        return radius * radius*pi;
    }

    @Override
    public double perimeter() {
        return 2 * radius * pi;
    }

    @Override
    public void draw() {
        System.out.println("Drawing a circle");
    }

    @Override
    public String toString() {
        return "Circle{" +
                " radius = " + radius +
                " area = " + area() +
                " perimeter = " + perimeter() +
                '}';
    }
}