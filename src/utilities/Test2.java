package utilities;

//import day26_Statics.StaticMembers.Data;
//import static day26_Statics.StaticMembers.Data.method3();


import static day26_Statics.StaticMembers.Data.d;
// without importing the class, just import the static variable
// import as many times (variables) as you want
import static day26_Statics.StaticMembers.Data.*;

public class Test2 {

    public static void main(String[] args) {

        //System.out.println(Data.d);
        System.out.println(d); // just call the variable, don't need a class

        method3(); // just call it through method name
        method4();

        // can be used in utility classes

    }
}
