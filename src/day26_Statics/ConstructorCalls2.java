package day26_Statics;

public class ConstructorCalls2 {

    public ConstructorCalls2() {
        // this(9); - violates rule 5
        System.out.println("Default");

    }

    public ConstructorCalls2(int a) { // it prints default, int arg
        this(); // calling a default constructor
        System.out.println("int arg");
    }

    public ConstructorCalls2(String arg) { // default, int arg
        this(8); //calling the constructor
        System.out.println("String arg");
    }


    public static void main(String[] args) {

        ConstructorCalls2 obj1 = new ConstructorCalls2();
        System.out.println("---------------------------------------------------------------------");

        ConstructorCalls2 obj2 = new ConstructorCalls2(10);
        System.out.println("------------------------------------------------------------------------");

        ConstructorCalls2 obj3 = new ConstructorCalls2("Java");

    }
}