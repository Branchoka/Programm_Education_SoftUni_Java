package P02MoreExersicesConditional;

import java.util.Scanner;

public class SleepyTomCat_02 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        int dayOff=Integer.parseInt(scanner.nextLine());

        int norma=30000;
        int workDay=365-dayOff;
        int timeForPlay=workDay*63+dayOff*127;

        int minutes=Math.abs(norma-timeForPlay)%60;
        int hours=Math.abs(norma-timeForPlay)/60;

        if (timeForPlay>=norma){
            System.out.println("Tom will run away");
            System.out.printf("%d hours and %d minutes more for play",hours,minutes);
        }else {
            System.out.println("Tom sleeps well");
            System.out.printf("%d hours and %d minutes less for play",hours,minutes);
        }
    }
}
