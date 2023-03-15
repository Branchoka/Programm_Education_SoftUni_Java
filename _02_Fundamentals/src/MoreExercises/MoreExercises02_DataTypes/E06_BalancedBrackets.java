package MoreExercises02_DataTypes;

import java.util.Scanner;

public class E06_BalancedBrackets {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        int linesNum=Integer.parseInt(scanner.nextLine());
        int counterOpen=0;
        int counterClosed=0;
        int startOpen=0;
        int startClosed=0;

        boolean isBalanced=true;

        for (int line = 1; line <= linesNum; line++) {
            String text = scanner.nextLine();
            if (text.equals("(")) {
                counterOpen++;
                counterClosed = 0;
                startOpen++;
            } else if (text.equals(")")) {
                counterOpen = 0;
                counterClosed++;
                startClosed++;
            }
            if (counterOpen > 1 || counterClosed > 1) {
                isBalanced = false;
                break;
            }
        }
            if (startClosed!=startOpen){
                isBalanced=false;
            }
            if (isBalanced){
                System.out.println("BALANCED");
            }else {
                System.out.println("UNBALANCED");
        }
    }
}
