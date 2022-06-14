package day23_arrayList;

import java.util.ArrayList;
/*
2. Write a program that can find the average number from an arrayList of integers
 */

public class AverageNumber {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(60);
        list.add(70);

        System.out.println(list);

        int sum = 0; // 1. get a sum of all numbers/elements

        for(Integer each : list){ // get each element of list
            sum += each;          // add each element to a sum
        }
        double average = sum / (double) list.size(); // sum divide by list size

        System.out.println("average = " + average);

        }

        }




