package day10_string;
import java.io.IOException;
import java.nio.file.Path;
import java.util.Scanner;

public class ReadFilesWithScanner {

    public static void main(String[] args) throws IOException {

        Scanner scan = new Scanner(Path.of("day10_string/text.txt"));

        System.out.println(scan.nextLine()); // to read an entire line
        System.out.println(scan.nextLine());
        System.out.println(scan.nextLine());

        System.out.println(scan.next()); // use this to read just one word from a file

        // System.out.println(scan.hasNext()); // a way to check is file is not empty
        scan.close();



    }

}
