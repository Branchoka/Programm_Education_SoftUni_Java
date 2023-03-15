package LAB08_TextProcessing;

import java.util.Scanner;

public class E04_Text_Filter {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        String[] bannedWords=scanner.nextLine().split(", ");

        String text=scanner.nextLine();

        for (String banWord:bannedWords){
            text=text.replace(banWord,repeatString("*",banWord.length()));
        }
        System.out.println(text);
    }
    public static String repeatString(String s,int count){

        String result="";
        for (int i = 0; i < count; i++) {
            result += s;
        }
        return result;
    }
}
