package day29_Inheritance.Inheritance;

public class Dog extends Animal{ // dog is Animal
    //     child        parent

    /*
public void method(){

    System.out.println(name);
    System.out.println(breed);
    System.out.println(gender);
    System.out.println(age);
    System.out.println(size);
    System.out.println(color);
    System.out.println(isAnimal);

    setInfo();
    eat();
    drink();
    eat();
    toString()
    }
     */

    public void bark(){
        System.out.println(name + " is barking");
    }
}

/*
Inherited:
6 invisible variables,
5 invisible methods
 */