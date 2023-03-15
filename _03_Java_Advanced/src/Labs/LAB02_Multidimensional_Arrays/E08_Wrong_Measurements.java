package LAB02_Multidimensional_Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class E08_Wrong_Measurements {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        int row =Integer.parseInt(scanner.nextLine());

        int [][] matrix= new int[row][];

        for (int r = 0; r < row; r++) {
            matrix[r] = readArray(scanner);
        }
        List<int[]> valueForReplacement = new ArrayList<>();
        int[] indexForInvalidNumber = readArray(scanner);

        int invalidNumber = matrix[indexForInvalidNumber[0]][indexForInvalidNumber[1]];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == invalidNumber){
                    int currentValue = getSum(matrix,i,j,invalidNumber);
                    valueForReplacement.add(new int[]{i,j,currentValue});
                }
            }
        }
        for (int[] entry : valueForReplacement) {
            matrix[entry[0]][entry[1]] = entry[2];
        }

        for (int[] x : matrix){
            for (int y : x){
                System.out.print(y + " ");
            }
            System.out.println();
        }
    }

    private static int getSum(int[][] matrix, int row, int col, int invalidNumber) {
        int sum = 0;

        if (isValidIndex(row - 1,matrix.length)){
            if (matrix[row - 1][col] != invalidNumber){
                sum+=matrix[row - 1][col];

            }
        }
        if (isValidIndex(row + 1,matrix.length)){
            if (matrix[row + 1][col] != invalidNumber){
                sum += matrix[row + 1][col];
            }
        }
        if (isValidIndex(col - 1,matrix[row].length)){
            if (matrix[row][col - 1] != invalidNumber){
                sum += matrix[row][col - 1];
            }
        }
        if (isValidIndex(col + 1, matrix[row].length)){
            if (matrix[row][col + 1] != invalidNumber){
                sum+= matrix[row][col + 1];
            }
        }
        return sum;
    }

    private static boolean isValidIndex(int index, int length) {
            return (index >= 0 && index < length);
    }

    private static int[] readArray(Scanner scanner) {
        return  Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();
    }
}
