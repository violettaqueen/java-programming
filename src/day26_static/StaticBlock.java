package day26_static;

public class StaticBlock {

    public StaticBlock(){
        System.out.println("Constructor"); // executes 3 times
    }

    static{
        System.out.println("Static Block"); // executes first
    }

    public static void main(String[] args) { // main method executes second

        System.out.println("Main method");

        new StaticBlock(); // static block executes only one time and
        new StaticBlock(); // constructor executes separately for each object
        new StaticBlock();
    }
}
