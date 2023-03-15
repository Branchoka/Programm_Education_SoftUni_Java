package Exercises02_Multidimensional_Arrays;

import java.util.Scanner;

public class E01_Fill_The_Matrix {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        String input=scanner.nextLine();
        int rows=Integer.parseInt(input.split(", ")[0]);
        String pattern=input.split(", ")[1];

        int [][] matrix = new int[rows][rows];

        if (pattern.equals("A")){
            fillMatrixPatternA(matrix);

        }else if (pattern.equals("B")){
            fillMatrixPatternB(matrix);
        }
        getPrintMatrix(matrix);
    }

    private static void getPrintMatrix(int [][] matrix) {
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix.length; col++) {
                System.out.print(matrix[row][col] + " ");
            }
            System.out.println();
        }
    }
// patternB - нечетен // patternA - четен
    private static void fillMatrixPatternB(int[][] matrix) {
        int startNumber=1;

        for (int col = 0; col < matrix.length; col++) {
            if ((col + 1) % 2 == 0){
                for (int row = matrix.length - 1; row >= 0; row--) {
                    matrix[row][col] =startNumber;
                    startNumber++;
                }
            }else {
                for (int row = 0; row <= matrix.length - 1; row++) {
                    matrix[row][col] =startNumber;
                    startNumber++;
                }
            }
        }
    }

    private static void fillMatrixPatternA(int [][] matrix) {
        int startNumber = 1;
        for (int col = 0; col < matrix.length; col++) {
            for (int row = 0; row < matrix.length; row++) {
                matrix[row][col] = startNumber;
                startNumber++;
            }
        }
    }
}
