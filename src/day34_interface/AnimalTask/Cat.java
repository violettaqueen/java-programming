package day34_interface.AnimalTask;

public class Cat extends Animals implements Playable{

    public Cat(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
    }

    @Override
    public void eat() {
        System.out.println("Cat " + getName()+ " is eating cat food");
    }

    @Override
    public void play() {
        System.out.println("");
    }
}
