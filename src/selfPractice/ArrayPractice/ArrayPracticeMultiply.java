package selfPractice.ArrayPractice;
/*
write a program that can multiply each odd number by 2
                ex: list = [1,2,3,4,5];
                    output: [2,2,6,4,10]

 */

import java.util.ArrayList;

public class ArrayPracticeMultiply {

    public static void main(String[] args) {

        ArrayList <Integer> numbers = new ArrayList<>();

        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);

        System.out.println(numbers);

        for (int i = 0; i < numbers.size(); i++) {
            if((numbers.get(i) %2 !=0)){
                numbers.set(i, numbers.get(i) *2);
            }
            System.out.println(numbers);
        }





            }
        }

