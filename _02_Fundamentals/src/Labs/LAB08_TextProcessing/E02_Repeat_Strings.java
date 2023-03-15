package LAB08_TextProcessing;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class E02_Repeat_Strings {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        String[] inputArr=scanner.nextLine().split(" ");

        List<String> repeatList=new ArrayList<>();
        for (int i = 0; i < inputArr.length; i++) {
            String currentWords=inputArr[i];
            int length=currentWords.length();
            String repeatWord=repeatString(currentWords,length);

            repeatList.add(repeatWord);

        }
        System.out.println(String.join("",repeatList));
    }
    public static String repeatString(String word,int length){
        String result="";
        for (int i = 0; i < length; i++) {
            result=result+word;
        }
        return result;
    }
}
