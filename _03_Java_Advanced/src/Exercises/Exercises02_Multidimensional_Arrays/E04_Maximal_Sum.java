package Exercises02_Multidimensional_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class E04_Maximal_Sum {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        String input = scanner.nextLine();
        int rows = Integer.parseInt(input.split("\\s+")[0]);
        int cols = Integer.parseInt(input.split("\\s+")[1]);

        int[][] matrix = new int[rows][cols];

        for (int row = 0; row < rows; row++) {
            matrix[row] = Arrays.stream(scanner.nextLine().split("\\s+"))
                    .mapToInt(Integer::parseInt)
                    .toArray();
        }
        int[] indexArr = new int[2];
        int maxSum = Integer.MIN_VALUE;
        for (int row = 0; row < rows - 2; row++) {
            for (int col = 0; col < cols - 2; col++) {
                int sum = 0;
                for (int rowIndex = row; rowIndex < row + 3; rowIndex++) {
                    for (int colIndex = col; colIndex < col + 3; colIndex++) {
                        sum += matrix[rowIndex][colIndex];
                    }
                }
                if (sum > maxSum){
                    maxSum = sum;
                    indexArr[0] = row;
                    indexArr[1] = col;
                }
            }
        }
        System.out.println("Sum = " + maxSum);
        for (int r = indexArr[0]; r < indexArr[0] + 3; r++) {
            for (int c = indexArr[1]; c < indexArr[1] + 3; c++) {
                System.out.print(matrix[r][c] + " ");
            }
            System.out.println();
        }
    }
}
