package day25_Constructor;

public class ConstructorInfo {

    public ConstructorInfo(){
        System.out.println("Object is created by using no argument constructor");
    }

    public ConstructorInfo(int a){
        System.out.println("Object is created by using no argument constructor");
    }



    public static void main(String[] args) {

        // no argument constructor, no parameters, default constructor, no return type, no specifier
        ConstructorInfo obj1 = new ConstructorInfo(10); //to create object
        ConstructorInfo obj2 = new ConstructorInfo();
        // ConstructorInfo obj3 = new ConstructorInfo("Java");
    }


}
