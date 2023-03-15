package Exercises_05_WhileLoop;

import java.util.Scanner;

public class Walking_04 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        int totalSteps=0;
        boolean goingHome=false;

        while (totalSteps<10000){
            String input=scanner.nextLine();

            if (input.equals("Going home")){
                goingHome=true;
                int steps=Integer.parseInt(scanner.nextLine());
                totalSteps=totalSteps+steps;
                break;
            }else {
                int steps=Integer.parseInt(input);
                totalSteps=totalSteps+steps;

            }
        }
        if (goingHome && totalSteps<10000){
            System.out.printf("%d more steps to reach goal.",10000-totalSteps);
        }else {
            System.out.println("Goal reached! Good job!");
            System.out.printf("%d steps over the goal!",totalSteps-10000);
        }
    }
}