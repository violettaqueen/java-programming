package lab_days.lab13_collection_map;


import lab_days.lab12_oop_exceptions.restaurant_task.Chef;
import lab_days.lab12_oop_exceptions.restaurant_task.Employee;
import lab_days.lab12_oop_exceptions.restaurant_task.Server;

import java.util.Arrays;

public class ArrayPractice {

    public static void main(String[] args) {

        int[] nums = new int[3];  // this array obj is eligible for garbage collection
        nums[0] = 10;
        nums[1] = 20;
        nums[2] = 30;

        // if I want to set a new size:
        nums = new int[5];

        System.out.println("--------------------------------------------------------------------------------------");

        int[] scores = {10, 20, 30, 40, 50};
        int[] scores2 = new int[] {10, 20, 30, 40, 50}; // array literal

        System.out.println("--------------------------------------------------------------------------------------");

        int[][] arr2D = {}; // for 1-D Array
        int[][][] arr3D = {}; // for 2-D Array

        System.out.println("-------------------------------------");

        Employee[] employees = {
                new Server("Emily", 35, 'F', "A01", 55000),
                new Chef("Daniel", 42, 'M', "B01", "Head Chef", 85000)
        };


        System.out.println(Arrays.toString( employees ) );





    }
}
