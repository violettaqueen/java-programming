package day29_Inheritance.AnimalTask;

public class Zoo { // creating an object in this class

    public static void main(String[] args) {


        Dog dog1 = new Dog();
        dog1.setInfo("Max", "Husky", 'M', 4, "large", "white");

        Cat cat1 = new Cat();
        cat1.setInfo("Felicia", "Cornish Rex", 'F', 3, "small", "grey");

        Tiger tiger1 = new Tiger();
        tiger1.setInfo("Rexy", "White Tiger", 'M', 6, "medium", "white");

        System.out.println(cat1);
        System.out.println(dog1);
        System.out.println(tiger1);

        System.out.println("---------------------------------------------------------------------------------");

        dog1.eat();   // this method came from a DOG class not Animal class because they were inherited
        dog1.sleep();
        dog1.drink();

        cat1.eat();
        cat1.drink();
        cat1.sleep();

        tiger1.eat();
        tiger1.drink();
        tiger1.sleep();

        System.out.println("--------------------------------------------------------------------------");

        dog1.bark();
        //cat1.bark();
        //tiger1.bark();

        cat1.meow();

        /*
        Object class: PARENT OF ALL THE CLASSES
        imported implicitly. Dog class is also extending the Object claass
         */







    }
}
