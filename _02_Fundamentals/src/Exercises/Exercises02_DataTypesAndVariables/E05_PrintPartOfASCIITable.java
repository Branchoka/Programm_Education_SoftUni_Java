package Exercises02_DataTypesAndVariables;

import java.util.Scanner;

public class E05_PrintPartOfASCIITable {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

       int start=Integer.parseInt(scanner.nextLine());
       int end=Integer.parseInt(scanner.nextLine());

        for (int i = start; i <= end; i++) {
            System.out.printf("%c " ,i);
        }


    }
}
