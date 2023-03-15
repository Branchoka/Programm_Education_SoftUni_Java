package Exercises_06_NestedLoop;

import java.util.Scanner;

public class EqualSumsEvenOddPosition_02 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        int firstNum=Integer.parseInt(scanner.nextLine());
        int secondNum=Integer.parseInt(scanner.nextLine());

        for (int i = firstNum; i <= secondNum; i++) {
            String currentNum="" + i;
            int OddSum=0;
            int EvenSum=0;
            for (int j = 0; j < currentNum.length(); j++) {
                int digit = Integer.parseInt("" +currentNum.charAt(j));
                if (j % 2 == 0) {
                    EvenSum += digit;
                } else {
                    OddSum += digit;
                }
            }
                if (EvenSum==OddSum){
                    System.out.print(i + " ");
                }
        }
    }
}
