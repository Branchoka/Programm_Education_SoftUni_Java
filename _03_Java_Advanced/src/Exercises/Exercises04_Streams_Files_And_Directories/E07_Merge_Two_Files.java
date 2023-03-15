package Exercises04_Streams_Files_And_Directories;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class E07_Merge_Two_Files {
    public static void main(String[] args) throws IOException {
        String pathLineOne = "C:\\Users\\Brani\\IdeaProjects\\Java_Advanced\\src\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\inputOne.txt";
        String pathLineTwo = "C:\\Users\\Brani\\IdeaProjects\\Java_Advanced\\src\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\inputTwo.txt";

        PrintWriter writer = new PrintWriter("outputAll.txt");

        List<String> allLinesOne = Files.readAllLines(Path.of(pathLineOne));
        allLinesOne.forEach(line -> writer.println(line));
        List<String> allLinesTwo = Files.readAllLines(Path.of(pathLineTwo));
        allLinesTwo.forEach(e -> writer.println(e));

        writer.close();
    }
}
