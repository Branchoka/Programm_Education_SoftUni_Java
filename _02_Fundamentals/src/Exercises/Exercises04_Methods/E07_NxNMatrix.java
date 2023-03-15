package Exercises04_Methods;

import java.util.Scanner;

public class E07_NxNMatrix {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        int number=Integer.parseInt(scanner.nextLine());

        printTheMatrix(number);
    }

    private static void printTheMatrix(int number) {
        for (int row = 1; row <= number; row++) {
            for (int col = 1; col <= number; col++) {
                System.out.print(" " + number);
            }
            System.out.println();
        }
    }
}
