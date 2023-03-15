package LAB04_Streams_Files_And_Directories;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class E04_Extract_Integers {
    public static void main(String[] args) throws FileNotFoundException {
        String basePath = "C:\\Users\\Brani\\Downloads\\04. Java-Advanced-Streams-Files-and-Directories-Resources\\04. Java-Advanced-Files-and-Streams-Lab-Resources";
        String inputPath = basePath + "\\input.txt";
        String outputPath = basePath + "\\04_output.txt";

        Scanner scanner = new Scanner(new FileInputStream(inputPath));
        PrintStream writer = new PrintStream(new FileOutputStream(outputPath));
       // PrintStream writer = System.out;


        while (scanner.hasNext()){
            if (scanner.hasNextInt()){
                System.out.println(scanner.nextInt());
            }
            scanner.next();
        }


    }
}
