package day34_interface.AnimalTask;

public class Duck extends Animals implements Playable, Flyable, Swimmable{

    public Duck(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
    }

    @Override
    public void eat() {

    }

    @Override
    public void play() {
        System.out.println("");
    }

    @Override
    public void fly() {
        System.out.println("");
    }

    @Override
    public void swim() {

    }
}
