package LAB06_ObjectsAndClasses;

import java.util.Random;
import java.util.Scanner;

public class E01_RandomizeWords {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        String input=scanner.nextLine();

        String[] wordsArr=input.split("\\s+");

        Random rndGenerator=new Random();

        for (int i = 0; i < wordsArr.length; i++) {
            int index1=rndGenerator.nextInt(wordsArr.length);
            int index2=rndGenerator.nextInt(wordsArr.length);

            String oldWord=wordsArr[index1];
            wordsArr[index1]=wordsArr[index2];
            wordsArr[index2]=oldWord;
        }
        System.out.println(String.join(System.lineSeparator(),wordsArr));
    }
}
