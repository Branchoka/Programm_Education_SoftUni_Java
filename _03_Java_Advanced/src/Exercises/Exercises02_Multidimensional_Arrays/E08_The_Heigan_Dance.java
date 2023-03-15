package Exercises02_Multidimensional_Arrays;

import java.util.Scanner;

public class E08_The_Heigan_Dance {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        double hsPoints = 3000000.0;
        int playerPoints = 18500;

        int startP1Row = 7;
        int startP1Col = 7;

        String lastSpell = "";
        boolean activeCloud = false;

        double damage = Double.parseDouble(scanner.nextLine());

        while (playerPoints > 0 && hsPoints > 0){
            hsPoints -= damage;

            if (activeCloud) {
                playerPoints -= 3500;
                activeCloud = false;

                if (playerPoints < 0) {
                    break;
                }
            }
            if (hsPoints < 0){
                break;
            }
                String[] input = scanner.nextLine().split("\\s+");

                String spell = input[0];
                int row = Integer.parseInt(input[1]);
                int col = Integer.parseInt(input[2]);

                boolean[][] chamber = new boolean[15][15];

                fillDamageHSChamber(row,col,chamber);

                if (chamber[startP1Row][startP1Col]){
                    if (isRowValid(chamber,startP1Row - 1) && !chamber[startP1Row - 1][startP1Col]){
                        startP1Row--;
                    }else if (isColValid(chamber,startP1Col + 1) && !chamber[startP1Row][startP1Col + 1]){
                        startP1Col++;
                    }else if (isRowValid(chamber,startP1Row + 1) && !chamber[startP1Row + 1][startP1Col]){
                        startP1Row++;
                    }else if (isColValid(chamber,startP1Col - 1) && !chamber[startP1Row][startP1Col - 1]){
                        startP1Col--;
                    }

                    if (chamber[startP1Row][startP1Col]){

                        switch (spell){
                            case "Cloud":
                                playerPoints -= 3500;
                                activeCloud = true;
                                lastSpell = "Plague Cloud";
                                break;
                            case "Eruption":
                                playerPoints -= 6000;
                                lastSpell = spell;
                                break;
                        }
                    }
                }
            }
            if (hsPoints > 0){
                System.out.printf("Heigan: %.2f%n",hsPoints);
            }else {
                System.out.println("Heigan: Defeated!");
            }
            if (playerPoints > 0){
                System.out.printf("Player: %d%n",playerPoints);
            }else {
                System.out.println("Player: Killed by "+ lastSpell);
            }

            System.out.println("Final position: " + startP1Row + ", " + startP1Col);
        }
    private static void fillDamageHSChamber(int row, int col, boolean[][] chamber) {
        for (int i = row - 1; i <= row + 1; i++) {
            if (i >= 0 && i < chamber.length){
                for (int j = col - 1; j <= col + 1; j++) {
                    if (j >= 0 && j < chamber[row].length){
                        chamber[i][j] = true;
                    }
                }
            }
        }
    }
    private static boolean isRowValid(boolean[][] hsChamber, int startP1Row) {
        return startP1Row >= 0 && startP1Row < hsChamber[startP1Row].length;
    }
    private static boolean isColValid(boolean[][] chamber, int startP1Col) {
        return startP1Col >= 0 && startP1Col < chamber.length;
    }
}
