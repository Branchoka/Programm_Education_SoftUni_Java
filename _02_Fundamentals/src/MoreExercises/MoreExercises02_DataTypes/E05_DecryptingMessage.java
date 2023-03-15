package MoreExercises02_DataTypes;

import java.util.Scanner;

public class E05_DecryptingMessage {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        int key=Integer.parseInt(scanner.nextLine());
        int lines=Integer.parseInt(scanner.nextLine());
        String result="";


        for (int i = 1; i <= lines; i++) {
            char currentSymbol=scanner.nextLine().charAt(0);
            result+=(char) ((int) currentSymbol+key);
        }
        System.out.println(result);
    }
}
