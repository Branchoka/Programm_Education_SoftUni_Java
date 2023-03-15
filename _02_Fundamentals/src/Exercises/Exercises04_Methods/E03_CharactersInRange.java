package Exercises04_Methods;

import java.util.Scanner;

public class E03_CharactersInRange {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        char symbol1=scanner.nextLine().charAt(0);
        char symbol2=scanner.nextLine().charAt(0);

        printTheSymbols(symbol1,symbol2);

    }
    public static void printTheSymbols(char sym1,char sym2){

        if (sym1<sym2){

        for (char sym = (char) (sym1 + 1); sym < sym2; sym++) {
            System.out.print(sym + " ");
        }

        }else {
            for (char i = (char) (sym2 + 1); i < sym1 ; i++) {
                System.out.print(i + " ");
            }

        }

    }
}
