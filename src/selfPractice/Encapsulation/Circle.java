package selfPractice.Encapsulation;

public class Circle {

    private double radius;
    public static double pi;

    public Circle(double radius) {
        getRadius();
    }
    static{
        pi = 3.14;
    }

    public double getRadius() {

        if (radius <= 0){
            System.out.println("Radius of the circle can not be zero or negative");
        }
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double calcArea(){
        return pi * (radius * radius);
    }
    public double perimeter(){
        return 2 * radius * pi;
    }

    public String toString() {
        return "Circle{" +
                "radius=" + getRadius() +
                "area =" + calcArea() +
                "perimeter =" + perimeter() +
                '}';
    }
}
/*
 Create a class named Circle

        privtae variables:
            radius

        public variable:
            pi

         Encapsulate all the private fields

                 1. radius of the circle can not be zero or negative

         Add a constructor that can set the raidus of coircle when circle object is created
                 (If the arguments not valid it should not be set to the instances)

         Methods:
             calcArea()
             calcPerimeter()
             toString(): displays the radius, area and perieter of the circle when the circle object is passed in the print statement
 */