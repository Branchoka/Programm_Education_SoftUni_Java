package Exercises04_Streams_Files_And_Directories;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class E02_Sum_Bytes {
    public static void main(String[] args) throws IOException {
        String path = "C:\\Users\\Brani\\Downloads\\04. Java-Advanced-Streams-Files-and-Directories-Resources (1)\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\input.txt";

        List<String> allLines = Files.readAllLines(Paths.get(path));

        long sum = 0;

        for (String reader : allLines){
            for (char symbol : reader.toCharArray()){
                sum += symbol;
            }
        }
        System.out.println(sum);
        

    }
}
