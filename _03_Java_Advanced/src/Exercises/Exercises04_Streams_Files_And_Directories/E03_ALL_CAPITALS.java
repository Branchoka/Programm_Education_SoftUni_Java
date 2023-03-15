package Exercises04_Streams_Files_And_Directories;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class E03_ALL_CAPITALS {
    public static void main(String[] args) throws IOException {
        String path = "C:\\Users\\Brani\\IdeaProjects\\Java_Advanced\\src\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\input.txt";

        BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"));

        List<String> allLines = Files.readAllLines(Path.of(path));
        for (String line : allLines) {
        writer.write(line.toUpperCase());
        writer.newLine();
        }
        writer.close();
    }
}
