package Exam2;

import java.util.Scanner;

public class Moon_01 {
    public static void main (String[]args){
        Scanner scanner=new Scanner(System.in);

        double speed=Double.parseDouble(scanner.nextLine());
        double neededFuel =Double.parseDouble(scanner.nextLine());

        double distance=384400*2;
        double time=distance/speed;
        double totalTime=time+3;
        double fuel= neededFuel*distance;

        System.out.printf("%.0f%n",Math.ceil(totalTime));
        System.out.printf("%.0f",fuel/100);

    }
}
