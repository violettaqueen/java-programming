package day26_static;

public class StaticBlock_vs_InstanceBlock_Constructor {

    public StaticBlock_vs_InstanceBlock_Constructor() { // has arguments
        System.out.println("Constructor");
    }
    {
        System.out.println("Instance Block");// no arguments, don't use it much
    }
    static{
        System.out.println("Static Block"); // no arguments, doesn't execute more than one time
    }

    public static void main(String[] args) {

        System.out.println("Main Method");

        new StaticBlock_vs_InstanceBlock_Constructor();
        new StaticBlock_vs_InstanceBlock_Constructor();

    }

}
