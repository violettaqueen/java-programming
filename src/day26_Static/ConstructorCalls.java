package day26_Static;

public class ConstructorCalls {

    public ConstructorCalls(){

        System.out.println("Default constructor");
    }
    public ConstructorCalls(int a){
        this(); // always call it first step before print statement
        System.out.println("Constructor with int argument");
    }

    // to call multiple constructors in a constructor
    public ConstructorCalls(double b){
        System.out.println("Constructor with double argument");
    }

    public ConstructorCalls(String s){
        this(2.5); // call only one constructor in a constructor!!!
    }

    public static void main(String[] args) {
        method1(); // regular method call any place/line
        System.out.println("------------------------------------------------------------");

        method2();
    }

    public static void method1(){
        //ConstructorCalls();
        System.out.println("Method 1");
    }
    public static void method2(){
        method1();
        System.out.println("Method 2");
    }
}
