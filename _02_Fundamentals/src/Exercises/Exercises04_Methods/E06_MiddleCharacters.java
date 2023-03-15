package Exercises04_Methods;

import java.util.Scanner;

public class E06_MiddleCharacters {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        String input=scanner.nextLine();


        printMiddleCharacter(input);

    }
    public static void printMiddleCharacter(String text){

        if (text.length() % 2 == 1){
            int indexOfMiddleCharacters=text.length() / 2;
            System.out.println(text.charAt(indexOfMiddleCharacters));
        }else {
            int indexFirstMiddleChar=text.length() / 2-1;
            int indexSecondMiddleChar=text.length() /2;

            System.out.println("" + text.charAt(indexFirstMiddleChar) + text.charAt(indexSecondMiddleChar));
        }

    }
}
