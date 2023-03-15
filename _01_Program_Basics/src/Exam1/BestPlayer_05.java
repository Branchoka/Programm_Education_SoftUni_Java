package Exam1;

import java.util.Scanner;

public class BestPlayer_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        double bestGoals = Integer.MIN_VALUE;
        String bestPlayer = "";

        while (!input.equals("END")) {
            int goals = Integer.parseInt(scanner.nextLine());
            if (goals > bestGoals) {
                bestGoals = goals;
                bestPlayer = input;
                if (bestGoals >= 10) {
                    break;
                }
            }
            input=scanner.nextLine();
        }
        System.out.printf("%s is the best player!%n",bestPlayer);
        if (bestGoals>=3){
            System.out.printf("He has scored %.0f goals and made a hat-trick !!!",bestGoals);
        }else {
            System.out.printf("He has scored %.0f goals.",bestGoals);
        }
    }
}
