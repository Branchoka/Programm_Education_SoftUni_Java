package LAB04_Streams_Files_And_Directories;

import java.io.*;


public class E05_Write_Every_Third_Line {
    public static void main(String[] args){
        String basePath = "C:\\Users\\Brani\\Downloads\\04. Java-Advanced-Streams-Files-and-Directories-Resources\\04. Java-Advanced-Files-and-Streams-Lab-Resources";
        String inputPath = basePath + "\\input.txt";
        String outputPath = basePath + "\\05_output.txt";


        try (BufferedReader reader = new BufferedReader(new FileReader(inputPath));
            PrintStream writer = new PrintStream(new FileOutputStream(outputPath))){
            int lineCount= 1;
            String line = reader.readLine();
            while (line != null){
                if (lineCount % 3 == 0){
                    writer.println(line);
                }
                line = reader.readLine();
                lineCount++;
            }

        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }

    }
}
