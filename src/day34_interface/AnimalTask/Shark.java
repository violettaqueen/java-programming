package day34_interface.AnimalTask;

public class Shark extends Animals implements WildAnimal, Swimmable{

    public Shark(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
    }

    @Override
    public void eat() {
        System.out.println("Shark " + getName() + " is eating fish");
    }

    @Override
    public void hunt() {
        System.out.println("");
    }

    @Override
    public void swim() {

    }
}
