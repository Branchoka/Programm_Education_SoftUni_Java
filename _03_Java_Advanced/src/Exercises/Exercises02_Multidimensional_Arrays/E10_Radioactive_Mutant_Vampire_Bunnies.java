package Exercises02_Multidimensional_Arrays;

import java.util.ArrayDeque;
import java.util.Scanner;

public class E10_Radioactive_Mutant_Vampire_Bunnies {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String[] input = scanner.nextLine().split("\\s+");

        int rows = Integer.parseInt(input[0]);
        int cols = Integer.parseInt(input[1]);
        char[][] matrix = new char[rows][cols];

        int[] playerPosition = {0, 0};
        ArrayDeque<int[]> bunnieIndex = new ArrayDeque<>();

        for (int row = 0; row < rows; row++) {
            String data = scanner.nextLine();
            for (int col = 0; col < cols; col++) {
                char currentChar = data.charAt(col);
                if (currentChar == 'P'){
                    playerPosition = new int[]{row,col};
                }else if (currentChar == 'B'){
                    bunnieIndex.offer(new int[]{row, col});
                }
                matrix[row][col] = data.charAt(col);
            }
        }
        String[] moves = scanner.nextLine().split("");
        int count = 0;
        while (count != moves.length){
            byte result = playerMakeMove(matrix, moves[count++].charAt(0), playerPosition);
            if (result == -2){
                printMatrix(matrix);
                System.out.printf("dead: %d %d%n",playerPosition[0],playerPosition[1]);
                return;
            }
            bunniesSpread(matrix,bunnieIndex);

            if (result == 0){
                printMatrix(matrix);
                System.out.printf("won: %d %d%n",playerPosition[0],playerPosition[1]);
                return;
            }else if (result == -1){
                printMatrix(matrix);
                System.out.printf("dead: %d %d%n",playerPosition[0],playerPosition[1]);
                return;
            }
        }
    }

    private static void bunniesSpread(char[][] matrix, ArrayDeque<int[]> bunnieIndex) {
        ArrayDeque<int[]> newBunnieIndexes = new ArrayDeque<>();
        while (!bunnieIndex.isEmpty()){
            int[] indexes = bunnieIndex.poll();
            int x = indexes[0];
            int y = indexes[1];

            if (isInBounds(matrix, x + 1, y) && matrix[x + 1][y] != 'B'){
                matrix[x + 1][y] = 'B';
                newBunnieIndexes.offer(new int[] {x + 1,y});
            }
            if (isInBounds(matrix, x - 1, y) && matrix[x - 1][y] != 'B'){
                matrix[x - 1][y] = 'B';
                newBunnieIndexes.offer(new int[] {x - 1, y});
            }
            if (isInBounds(matrix, x ,y + 1) && matrix[x][y + 1] != 'B'){
                matrix[x][y + 1] = 'B';
                newBunnieIndexes.offer(new int[] {x, y + 1});
            }
            if (isInBounds(matrix, x, y - 1) && matrix[x][y - 1] != 'B'){
                matrix[x][y - 1] = 'B';
                newBunnieIndexes.offer(new int[] {x, y - 1});
            }
        }
        while (!newBunnieIndexes.isEmpty()){
            bunnieIndex.offer(newBunnieIndexes.pop());
        }
    }

    private static byte playerMakeMove(char[][] matrix, char move, int[] playerPosition) {
        int x = playerPosition[0];
        int y = playerPosition[1];

        if (matrix[x][y] == 'B'){
            return -2;
        }
        int[] oldPlayerPos = new int[]{x, y};
        switch (move){
            case 'R':
                y++;
                break;
            case 'L':
                y--;
                break;
            case 'U':
                x--;
                break;
            case 'D':
                x++;
                break;
        }
        matrix[oldPlayerPos[0]][oldPlayerPos[1]] = '.';
        if (isInBounds(matrix, x, y)){
            playerPosition[0] = x;
            playerPosition[1] = y;
            if (matrix[x][y] == '.'){
                matrix[x][y] = 'P';
                return 1;
            }else {
                return -1;
            }
        }else {
            return 0;
        }
    }

    private static boolean isInBounds(char[][] matrix, int x, int y) {
        return ((x >= 0 && x < matrix.length) && (y >= 0 && y< matrix[x].length));
    }
    public static void printMatrix(char[][] matrix){
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                System.out.print(matrix[row][col]);
            }
            System.out.println();
        }
    }
}
