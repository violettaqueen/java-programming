package day34_interface.AnimalTask;

public class Lion extends Animals{

    public Lion(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
    }

    @Override
    public void eat() {
        System.out.println("Lion " + getName()+ " is eating animals");
    }
}
