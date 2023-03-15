package P02MoreExersicesConditional;

import java.util.Scanner;

public class PipesInPool_01 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        int V=Integer.parseInt(scanner.nextLine());
        int firstPipePerHour=Integer.parseInt(scanner.nextLine());
        int secondPipePerHour=Integer.parseInt(scanner.nextLine());
        double HoursForBreak=Double.parseDouble(scanner.nextLine());

        double littersP1=firstPipePerHour*HoursForBreak;
        double littersP2=secondPipePerHour*HoursForBreak;

        double water=littersP1+littersP2;
        double v=V*1.0;


            double percentFull=water/V *100;
            double percentP1=(littersP1/water)*100;
            double percentP2=(littersP2/water)*100;



        if (water > V) {
            double overflow=water-V;
            System.out.printf("For %.2f hours the pool overflows with %.2f liters",HoursForBreak,overflow);
        }else {
            System.out.printf("The pool is %.2f%% full. Pipe 1: %.2f%%. Pipe 2: %.2f%%.",percentFull,percentP1,percentP2);
        }
    }
}
