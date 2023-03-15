package LAB02_Multidimensional_Arrays;

import java.util.Scanner;

public class E01_Compare_Matrices {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        String[] inputDimensions=scanner.nextLine().split(" ");
        int firstRows=Integer.parseInt(inputDimensions[0]);
        int firstCols=Integer.parseInt(inputDimensions[1]);

        int[][] firstMatrix= new int[firstRows][firstCols];

        for (int i = 0; i < firstRows; i++) {
            String[] parts = scanner.nextLine().split(" ");
            for (int j = 0; j < firstCols; j++) {
                firstMatrix[i][j]=Integer.parseInt(parts[j]);
            }
        }
        inputDimensions=scanner.nextLine().split(" ");
        int secondRows=Integer.parseInt(inputDimensions[0]);
        int secondCols=Integer.parseInt(inputDimensions[1]);

        int[][] secondMatrix = new int[secondRows][secondCols];

        for (int rows = 0; rows < secondRows; rows++) {
            String[] parts = scanner.nextLine().split(" ");
            for (int cols = 0; cols < secondCols; cols++) {
                secondMatrix[rows][cols] = Integer.parseInt(parts[cols]);
            }
        }
        if (firstRows != secondRows || firstCols!= secondCols){
            System.out.println("not equal");
            return;
        }
        for (int i = 0; i < firstRows; i++) {
            for (int j = 0; j < firstCols; j++) {
                if (firstMatrix[i][j] != secondMatrix[i][j]){
                    System.out.println("not equal");
                    return;
                }
            }
        }
        System.out.println("equal");
    }
}
