package selfPractice.StaticMethodPractice;

public class Circle {
    public double radius;  // instance - to be able to store different value to a variable
    public double diameter;
    public static double pi = 3.14;  // static - applies same date to all circle objects

    public Circle(double radius) {  // no need to provide diameter in argument, fewer arguments is best!!!
        this.radius = radius;     // as long as I have the radius, I can calculate the diameter
        this.diameter = 2 * radius;
    }
    public double calcCircleArea(){  // area is different for every circle object
         return pi * (radius * radius); // to make data to be reusable - return method; Ex: use in a toString();

    }
    public double calcPerimeter(){
        return 2 * radius * pi;

    }
    public static void printPiValue(){
        System.out.println("PI value is: " + pi); // static method accepts only static members

    }

    public String toString() {
        return "Circle {" +
                "radius=" + radius +
                ", diameter=" + diameter +
                ", PI value =" + pi +
                ", area =" + calcCircleArea() +  // concate area: call the method, and the value be concated to String
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