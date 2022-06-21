package day26_Static;

public class StaticInitializationBlock {

    public static int a;
    public static double b;
    public static String c;  // all object will have the same value

    // public static ExcelSheet sheet; read file, get file, get a sheet from a file, etc. - 4 steps to set a variable
    // need a block of code in order to set  a variable
    // static block gets executed automatically, it can set any static variable

    static {

        a = 100;
        b = 20.5;
        c = "Java";

    }
    // call these variables through the class

    /*
    public StaticInitializationBlock(){ // a constructor gets executed only when you create an object. it's not the best
        a = 100;
        b = 20.5;
        c = "Java";
    }

     */
}
