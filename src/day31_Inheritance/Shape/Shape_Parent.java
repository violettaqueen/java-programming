package day31_Inheritance.Shape;

public class Shape_Parent {

    private String name; //triangle, circle, square

    public Shape_Parent() {  // default constructor, no parameters
        setName(getClass().getSimpleName());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double area(){ // return method
        return 0;        // in child class I will change it
    }
    public double perimeter(){
        return 0;
    }
    public void draw(){     // we don't know what shape be there, leaving empty:
        System.out.println("Drawing a shape");
    }

    @Override
    public String toString() {
        return  getClass().getSimpleName() + "{" +
                " name= '" + name + '\'' +
                ", area= '" + area() + '\'' +
                ", perimeter= '" + perimeter() + '\'' +
                '}';
    }
}
