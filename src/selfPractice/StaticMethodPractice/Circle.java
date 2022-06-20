package selfPractice.StaticMethodPractice;

public class Circle {
    public double radius;
    public double diameter;
    public static double pi = 3.14;

    public Circle(double radius, double diameter) {
        this.radius = radius;
        this.diameter = diameter;
    }
    public double calcArea(){
        double area = pi * radius;
        return area;
    }
    public double calcPerimeter(){
        double perimeter = 2 * pi * radius;
        return perimeter;
    }
    public static void printPi(){
        System.out.println("Print pi " + pi);
    }


    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", diameter=" + diameter +
                ", print pi =" + pi +
                ", area =" + calcArea() +
                ", perimeter =" + calcPerimeter() +
                '}';
    }
}
/*
Circle Task:
		1. Create a class named Circle:

				Attributes:
					instance: radius, diameter
					static: pi

				Add a constructor that can set All the fields (instances)
					HINT: we only need to know the radius to set the radius & diameter

				Actions:
					calcArea(): returns the area of Circle
					calcPerimeter(): returns the perimeter of Circle
					printPi(): displays PI value
					toString(): displays the radius, diameter, pi, area and perimeter of the circle when
					the object of circle is passed in the print statement

 */