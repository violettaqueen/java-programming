package day26_static;

import day27_accessModifiers.AccessModifiers;

public class Test {

    // lets call a, b, c variables

    public static void main(String[] args) {

        System.out.println(StaticInitializationBlock.a); // code executed top to bottom
        System.out.println(StaticInitializationBlock.b);
        System.out.println(StaticInitializationBlock.c);

        System.out.println("---------------------------------------------------------------------------------");

        System.out.println(AccessModifiers.publicDate);


    }
}
