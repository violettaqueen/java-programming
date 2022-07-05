package day34_interface.AnimalTask;

public class Dolphin extends Animals implements Playable, Swimmable{
    @Override
    public void play() {
        System.out.println("");
    }

    public Dolphin(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
    }

    @Override
    public void eat() {
        System.out.println("Dolphin " + getName() + " is eating fish");
    }

    @Override
    public void swim() {

    }
}
