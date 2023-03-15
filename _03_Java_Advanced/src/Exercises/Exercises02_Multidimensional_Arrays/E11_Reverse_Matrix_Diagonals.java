package Exercises02_Multidimensional_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class E11_Reverse_Matrix_Diagonals {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        int[] dimensions = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();

        int rows = dimensions[0];
        int cols = dimensions[1];

        int[][] matrix = new int[rows][cols];

        for (int r = 0; r < matrix.length; r++) {
            matrix[r] = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        }

        for (int c = cols - 1; c >= 1; c--) {
            System.out.println();
            int row = rows - 1;
            int col = c;
            while (col <= cols - 1 && row >= 0){
                System.out.print(matrix[row][col] + " ");
                row--;
                col++;
            }
        }
        for (int r = matrix.length - 1; r >= 0; r--) {
            System.out.println();
            int row = r;
            int col = 0;
            while (row >= 0 && col <= cols-1){
                System.out.print(matrix[row][col] + " ");
                row--;
                col++;
            }
        }
        System.out.println();
    }
}
