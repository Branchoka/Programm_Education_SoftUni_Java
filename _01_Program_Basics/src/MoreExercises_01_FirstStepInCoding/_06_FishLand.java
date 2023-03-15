package P01MoreExersices;

import java.util.Scanner;

public class FishLand_06 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        double priceMackerel=Double.parseDouble(scanner.nextLine());
        double priceSprinkle=Double.parseDouble(scanner.nextLine());
        double kilosBonito=Double.parseDouble(scanner.nextLine());
        double kilosScad=Double.parseDouble(scanner.nextLine());
        int kilosMussels=Integer.parseInt(scanner.nextLine());

        double priceBonito=priceMackerel+priceMackerel*0.60;
        double totalBonito=kilosBonito*priceBonito;
        double priceScad=priceSprinkle+priceSprinkle*0.80;
        double totalScad=kilosScad*priceScad;
        double totalMussels=kilosMussels*7.50;

        double sum=totalBonito+totalScad+totalMussels;

        System.out.printf("%.2f",sum);

    }
}
