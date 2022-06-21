package day26_Statics;

public class InstanceBlock {

    // instance block. one object block executes one time, two objects two blocks etc.
    // gets executed before constructor
    // instance initialization block : to initialize instance variables

    {
        System.out.println("Instance block");
    }

    // constructor gets executed once the object is created

    public InstanceBlock(){
        System.out.println("Constructor");
    }

    public static void main(String[] args) {

        new InstanceBlock();
        new InstanceBlock();
        new InstanceBlock();
    }
}
