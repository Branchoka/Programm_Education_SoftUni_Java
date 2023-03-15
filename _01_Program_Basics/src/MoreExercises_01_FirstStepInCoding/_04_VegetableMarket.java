package P01MoreExersices;

import java.util.Scanner;

public class VegetableMarket_04 {
    public static void main (String[]args){
        Scanner scanner=new Scanner(System.in);


        double priceVegetables=Double.parseDouble(scanner.nextLine());
        double priceFruits=Double.parseDouble(scanner.nextLine());
        int kilosVegetables=Integer.parseInt(scanner.nextLine());
        int kilosFruits=Integer.parseInt(scanner.nextLine());

        double vegetables=priceVegetables*kilosVegetables;
        double fruits=priceFruits*kilosFruits;

        double total=vegetables+fruits;
        double PriceInEuro=total/1.94;

        System.out.printf("%.2f",PriceInEuro);

    }
}
