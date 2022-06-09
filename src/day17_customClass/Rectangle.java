package day17_customClass;

public class Rectangle {

    public double length;
    public double width;
    public double area;
    public double perimeter;


    public void setInfo2(double length, double width) {
        this.length = length;
        this.width = width;
    }
    public double CalculateArea(double length,double width){
        this.length = length;
        this.width = width;
        double area = width * length;
        return area;}

        public double CalculatePerimeter(double length, double width){
        this.length = length;
        this.width = width;
        double perimeter = 2 * (length + width);
        return perimeter;
        }

    public String toString() {
        return "Rectangle{" +
                "length=" + length +
                ", width=" + width +
                ", area=" + area +
                ", perimeter=" + perimeter +
                '}';
    }
}

