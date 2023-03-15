package LAB04_Streams_Files_And_Directories;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;

public class E06_Sort_Lines {
    public static void main(String[] args) throws IOException {
        String basePath = "C:\\Users\\Brani\\Downloads\\04. Java-Advanced-Streams-Files-and-Directories-Resources\\04. Java-Advanced-Files-and-Streams-Lab-Resources";
        String inputPath = basePath + "\\input.txt";
        String outputPath = basePath + "\\06_output.txt";

        Path path = Paths.get(inputPath);
        List<String> sortedList = Files.readAllLines(path).stream().sorted().collect(Collectors.toList());
        Path output = Paths.get(outputPath);
        Files.write(output,sortedList);
    }
}
