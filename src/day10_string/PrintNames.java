package day10_string;
/*
1. Create a text file named MyClassmates.txt
    1.2 store 10 of your classmates' full names in separate lines
    2. Create class named PrintNames, and write program that can read
    MyClassmates.txt  and print the names of those 10 students
 */
import java.io.IOException;
import java.nio.file.Path;
import java.util.Scanner;
public class PrintNames {

    public static void main(String[] args) throws IOException {

        Scanner scan = new Scanner(Path.of("day10_string/MyClassmates.txt"));

        System.out.println(scan.nextLine());
        System.out.println(scan.nextLine());
        System.out.println(scan.nextLine());
        System.out.println(scan.nextLine());
        System.out.println(scan.nextLine());
        System.out.println(scan.nextLine());
        System.out.println(scan.nextLine());
        System.out.println(scan.nextLine());
        System.out.println(scan.nextLine());
        System.out.println(scan.nextLine());

        scan.close();
    }


}
