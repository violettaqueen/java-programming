package day34_interface.AnimalTask;

public class Eagle extends Animals implements Flyable, WildAnimal{

    public Eagle(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
    }

    @Override
    public void eat() {
        System.out.println("Eagle " + getName() + " is eating snakes");
    }

    @Override
    public void fly() {
        System.out.println("");
    }

    @Override
    public void hunt() {
        System.out.println("");
    }
}
