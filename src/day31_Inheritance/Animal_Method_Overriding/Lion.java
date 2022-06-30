package day31_Inheritance.Animal_Method_Overriding;

public class Lion extends Animal_parent{

    private boolean isAfricanLion;

    public Lion(String name, String breed, char gender, int age, String size, String color, boolean isAfricanLion) {
        super(name, breed, gender, age, size, color);
        setAfricanLion(isAfricanLion);
    }

    public boolean isAfricanLion() {
        return isAfricanLion;
    }

    public void setAfricanLion(boolean africanLion) {
        isAfricanLion = africanLion;
    }

    @Override
    public void eat() {
        System.out.println("Lion " + getName() + " is eating deer");
    }

    public void roar(){
        System.out.println("Lion " + getName() + " is roaring");

    }

    @Override
    public String toString() {
        return super.toString().replace("}", "") +
        ", African lion='" + isAfricanLion + '\'' +
                '}';
    }
}

