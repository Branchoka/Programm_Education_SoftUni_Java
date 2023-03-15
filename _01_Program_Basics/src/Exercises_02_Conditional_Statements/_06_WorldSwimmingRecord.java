package EXERCISES02;

import java.util.Scanner;

public class WorldSwimmingRecord06 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        double seconds=Double.parseDouble(scanner.nextLine());
        double meters=Double.parseDouble(scanner.nextLine());
        double secFor1m=Double.parseDouble(scanner.nextLine());

        double neededM=meters*secFor1m;
        double slowDown=Math.floor(meters/15);
        double resistance=slowDown*12.5;

        double finalResult=neededM+resistance;
        if (finalResult<seconds){
            System.out.printf("Yes, he succeeded! The new world record is %.2f seconds.",finalResult);
        }else {
            System.out.printf("No, he failed! He was %.2f seconds slower.",Math.abs(seconds-finalResult));
        }
    }
}
