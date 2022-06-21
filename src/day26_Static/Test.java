package day26_Static;

import day27_AccessModifiers.AccessModifiers;

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
