package Exercises02_Multidimensional_Arrays;

import java.util.Scanner;

public class E02_Matrix_Of_Palindromes {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        String input = scanner.nextLine();
        int rows = Integer.parseInt(input.split(" ")[0]);
        int cols = Integer.parseInt(input.split(" ")[1]);

        String [][] matrix = new String[rows][cols];
        StringBuilder string = new StringBuilder();

        int asciiCode = 97;

        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                string.append((char) (asciiCode + row));
                string.append((char) (asciiCode + row + col));
                string.append((char) (asciiCode + row));
                matrix [row][col] = string.toString();
                string = new StringBuilder();
            }
        }
        print(matrix);
    }

    private static void print(String[][] matrix) {
        for (String[] strings : matrix) {
            for (String y : strings) {
                System.out.print(y + " ");
            }
            System.out.println();
        }
    }
}
