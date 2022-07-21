package day18_garbageCollection;

class Car{

    public String brand, model, color;

}





public class MemoryAllocation {  // only one public class in file

    public static void main(String[] args) {

        int a = 100;  // stack

        Car car = new Car();
        // stack    heap

    }

   public static void method1(){   // methods allocated in stack
        int b = 200;  // stack

   }
    public static void method2(){

        String c = "Hello world";
       // stack      // heap
    }

}
