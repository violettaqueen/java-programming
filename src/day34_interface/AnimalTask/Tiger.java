package day34_interface.AnimalTask;

public class Tiger extends Animals implements WildAnimal{
    public Tiger(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
    }

    @Override
    public void eat() {
        System.out.println("Tiger " + getName()+ " is eating buffalo");
    }

    @Override
    public void hunt() {
        System.out.println("");
    }
}
