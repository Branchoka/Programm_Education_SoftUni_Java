package Exercises04_Methods;
import java.util.Scanner;

public class E02_VowelsCount {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        String input=scanner.nextLine();
        printVowelsCount(input.toLowerCase());

    }
    public static void printVowelsCount(String input){

        int count =0;

        for (char vowels: input.toCharArray())

            if (vowels == 'a' || vowels == 'i' || vowels == 'o' || vowels == 'e' || vowels == 'u'){
            count++;

        }

        System.out.println(count);

    }
}
