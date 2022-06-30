package day31_Inheritance.Animal_Method_Overriding;

public class Cat extends Animal_parent{


    public Cat(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
    }

    @Override  // optional statement
    public void eat() {
        System.out.println("Cat " + getName() + " is eating cat food");
    }

    @Override
    public void sleep() {
        System.out.println("Cat " + getName() + " sleeps 12 hrs a day");
    }
    public void scratch(){
        System.out.println("Cat " + getName() + " is scratching");
    }
}
