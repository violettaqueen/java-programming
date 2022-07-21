package day27_accessModifiers;

public class AccessModifiers {

    public static int publicDate = 200;

    //
    protected static int protectedData = 300; // is accessible same package ONLY

    static int defaultModifier = 400; // don't give any keyword

    private static int privateModifier = 500; // only visible withing a class

    // constructor

   private AccessModifiers(){ // only visible in SAME class
   }
   public static void publicMethod(){
       System.out.println("Public");
   }
   protected static void protectedMethod(){
       System.out.println("protected");
   }
   static void defaultModifier1(){
       System.out.println("Default");
   }
   private static void privateModifier1(){
       System.out.println("private");
   }


    public static void main(String[] args) {

        System.out.println(publicDate);
        System.out.println(protectedData); // accessible in the same class, not always accessible outside a package
        System.out.println(defaultModifier); // accessible withing the same class and the same package, NEVER accessible in different package
        System.out.println(privateModifier); // is accessible within the same package
    }
}
