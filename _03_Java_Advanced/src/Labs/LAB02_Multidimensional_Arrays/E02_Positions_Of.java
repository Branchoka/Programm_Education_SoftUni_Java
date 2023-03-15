package LAB02_Multidimensional_Arrays;

import java.util.Scanner;

public class E02_Positions_Of {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        String[] rowsAndCols= scanner.nextLine().split(" ");

        int rows=Integer.parseInt(rowsAndCols[0]);
        int cols=Integer.parseInt(rowsAndCols[1]);
        int[][] matrix= new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            String[] columnData= scanner.nextLine().split(" ");
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = Integer.parseInt(columnData[j]);
            }
        }
        int search=Integer.parseInt(scanner.nextLine());

        boolean isFound=false;
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                if (matrix[row][col] == search){
                    isFound=true;
                    System.out.println(row + " " + col);
                }
            }
        }
        if (!isFound){
            System.out.println("not found");
        }
    }
}
