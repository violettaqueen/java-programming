package day31_Inheritance.Animal_Method_Overriding;

public class Dog extends Animal_parent{
    public Dog(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
    }

    @Override
    public void eat() {
        System.out.println("Dog  " + getName() + " is eating dog food");
    }

    @Override
    public void sleep() {
        super.sleep();
    }

  public void bark(){
      System.out.println("Dog " + getName() + " is barking");
  }
}
