package LAB02_Multidimensional_Arrays;

import java.util.Scanner;

public class E05_Maximum_Sum_Of_2x2_Submatrix {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        String[] rowsAndCols=scanner.nextLine().split(", ");

        int rows=Integer.parseInt(rowsAndCols[0]);
        int cols=Integer.parseInt(rowsAndCols[1]);

        int [][] matrix=new int[rows][cols];

        for (int row = 0; row < rows; row++) {
            String[] parts=scanner.nextLine().split(", ");
            for (int col = 0; col < cols; col++) {
                matrix[row][col] = Integer.parseInt(parts[col]);

            }
        }
        int maxSumTopLeftRow= -1;
        int maxSumTopLeftCol = -1;

        int maxSum=0;

        for (int row = 0; row < matrix.length - 1; row++) {
            for (int col = 0; col < matrix[row].length - 1; col++) {
                int currentSum=matrix[row][col] + matrix[row][col + 1] + matrix[row+1][col]
                        + matrix[row + 1][col + 1];

                if (currentSum > maxSum){
                    maxSum = currentSum;

                    maxSumTopLeftRow=row;
                    maxSumTopLeftCol=col;
                }
            }
        }
        System.out.println(matrix[maxSumTopLeftRow][maxSumTopLeftCol] + " " + matrix[maxSumTopLeftRow][maxSumTopLeftCol + 1]);
        System.out.println(matrix[maxSumTopLeftRow + 1][maxSumTopLeftCol] + " " + matrix[maxSumTopLeftRow + 1][maxSumTopLeftCol + 1]);
        System.out.println(maxSum);

    }
}
