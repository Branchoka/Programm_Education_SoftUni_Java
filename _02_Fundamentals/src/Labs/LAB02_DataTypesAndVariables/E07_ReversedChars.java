package LAB02_DataTypesAndVariables;

import java.util.Scanner;

public class E07_ReversedChars {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        char firstSymbol=scanner.nextLine().charAt(0);
        char secondSymbol=scanner.nextLine().charAt(0);
        char thirdSymbol=scanner.nextLine().charAt(0);

        System.out.printf("%c %c %c",thirdSymbol,secondSymbol,firstSymbol);
    }
}
