package day34_interface.AnimalTask;

public class Parrot extends Animals implements Playable, Flyable{

    public Parrot(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
    }

    @Override
    public void eat() {
        System.out.println("Parrot " + getName()+ " is eating seeds");
    }

    @Override
    public void play() {
        System.out.println("");
    }

    @Override
    public void fly() {
        System.out.println("");
    }
}
