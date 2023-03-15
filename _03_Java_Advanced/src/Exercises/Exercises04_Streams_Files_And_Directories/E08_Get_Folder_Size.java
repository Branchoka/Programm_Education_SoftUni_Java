package Exercises04_Streams_Files_And_Directories;

import java.io.File;

public class E08_Get_Folder_Size {
    public static void main(String[] args) {
        String path = "C:\\Users\\Brani\\IdeaProjects\\Java_Advanced\\src\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\Exercises Resources";
        File folder = new File(path);

        File[] allFilesInFolder = folder.listFiles();

        int folderSize = 0;
        for (File file : allFilesInFolder) {
            folderSize += file.length();
        }
        System.out.println("Folder size: " + folderSize);
    }
}
