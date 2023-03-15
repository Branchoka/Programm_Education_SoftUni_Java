package Exercises02_DataTypesAndVariables;

import java.util.Scanner;

public class E08_BeerKegs {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        int n=Integer.parseInt(scanner.nextLine());
        double volume=Double.MIN_VALUE;
        String winnerKeg="";

        for (int i = 1; i <= n; i++) {

            String model=scanner.nextLine();
            double r=Double.parseDouble(scanner.nextLine());
            int h=Integer.parseInt(scanner.nextLine());

            double currentVolume=Math.PI * Math.pow (r,2)*h;

            if (currentVolume>volume){
                volume=currentVolume;
                winnerKeg=model;
            }
        }
        System.out.printf("%s",winnerKeg);

    }
}
