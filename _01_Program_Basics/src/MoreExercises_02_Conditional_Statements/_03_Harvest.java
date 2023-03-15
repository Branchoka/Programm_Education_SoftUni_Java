package P02MoreExersicesConditional;

import java.util.Scanner;

public class Harvest_03 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        int X=Integer.parseInt(scanner.nextLine());
        double Y=Double.parseDouble(scanner.nextLine());
        int Z=Integer.parseInt(scanner.nextLine());
        int NumEmp=Integer.parseInt(scanner.nextLine());

        double sumGrape=X*Y;
        double wine=(0.4 * sumGrape)/2.5;

        if (wine>Z){
            double littersLeft=wine-Z;
            double littersPerPerson=littersLeft/NumEmp;
            System.out.printf("Good harvest this year! Total wine: %.0f liters.%n", Math.floor(wine));
            System.out.printf("%.0f liters left -> %.0f liters per person.", Math.ceil(littersLeft), Math.ceil(littersPerPerson));
        }else {
            double neededWine=Z-wine;

            System.out.printf("It will be a tough winter! More %.0f liters wine needed.",Math.floor(neededWine));
        }
    }
}
