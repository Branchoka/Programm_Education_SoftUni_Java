package Exercises02_DataTypesAndVariables;

import java.util.Scanner;

public class E11_Snowballs {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        int NumBalls=Integer.parseInt(scanner.nextLine());
        double max=Double.MIN_VALUE;
        int maxSnowballSnow=Integer.MIN_VALUE;
        int maxSnowballTime=Integer.MIN_VALUE;
        int maxSnowballQuality=Integer.MIN_VALUE;


        for (int balls = 1; balls <= NumBalls ; balls++) {
            int snowballSnow = Integer.parseInt(scanner.nextLine());
            int snowballTime = Integer.parseInt(scanner.nextLine());
            int snowballQuality = Integer.parseInt(scanner.nextLine());

            int value = snowballSnow / snowballTime;
            double snowballValue = Math.pow(value, snowballQuality);

            if (snowballValue > max) {
                max = snowballValue;
                maxSnowballSnow = snowballSnow;
                maxSnowballTime = snowballTime;
                maxSnowballQuality = snowballQuality;

            }
        }
            System.out.printf("%d : %d = %.0f (%d)",maxSnowballSnow,maxSnowballTime,max,maxSnowballQuality);

    }
}

