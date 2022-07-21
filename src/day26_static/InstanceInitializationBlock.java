package day26_static;

public class InstanceInitializationBlock {

    public String name;
    public int age;

    /*
    // instance block to initialize instance variables

    {
        name = "James"; // James will be given by default to every single object!!
        age = 20;       // all objects are going to have the same age; -> become default values
    }
    */

    public InstanceInitializationBlock(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public static void main(String[] args) {

         InstanceInitializationBlock obj1 = new InstanceInitializationBlock("James", 25);
         InstanceInitializationBlock obj2 = new InstanceInitializationBlock("Violetta", 34);

        System.out.println(obj1.name);
        System.out.println(obj2.name);
    }

}
