package Exercises04_Streams_Files_And_Directories;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class E05_Line_Numbers {
    public static void main(String[] args) throws IOException {
        String path = "C:\\Users\\Brani\\IdeaProjects\\Java_Advanced\\src\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\inputLineNumbers.txt";

        List<String> allLines = Files.readAllLines(Path.of(path));

        PrintWriter writer = new PrintWriter("output_Line_Numbers.txt");
        int lineNumber=1;
        for (String line : allLines) {
            writer.println(lineNumber + ". " + line);
            lineNumber++;
        }
        writer.close();
    }
}
