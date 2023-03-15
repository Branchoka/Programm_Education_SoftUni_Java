package Exercises04_Streams_Files_And_Directories;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class E06_Word_Count {
    public static void main(String[] args) throws IOException {
        String path = "C:\\Users\\Brani\\IdeaProjects\\Java_Advanced\\src\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\words.txt";
        List<String> allLines = Files.readAllLines(Path.of(path));

        Map<String,Integer> countWords = new HashMap<>();

        for (String line : allLines) {
            String[] wordsOnCurrentRow = line.split("\\s+");
            Arrays.stream(wordsOnCurrentRow).forEach(word -> {
                countWords.put(word,0);
            });
        }
        String pathText = "C:\\Users\\Brani\\IdeaProjects\\Java_Advanced\\src\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\text.txt";
        List<String> allLinesText = Files.readAllLines(Path.of(pathText));

        for (String lineText : allLinesText) {
            String[] words = lineText.split("\\s+");
            for (String word : words){
                if (countWords.containsKey(word)){
                    countWords.put(word,countWords.get(word) + 1);
                }
            }
        }
        PrintWriter writer = new PrintWriter("result.txt");
        countWords.entrySet()
                .stream()
                .sorted((e1,e2) -> e2.getValue().compareTo(e1.getValue()))
                .forEach(entry -> writer.println(entry.getKey() + " - " + entry.getValue()));
        writer.close();

    }
}
