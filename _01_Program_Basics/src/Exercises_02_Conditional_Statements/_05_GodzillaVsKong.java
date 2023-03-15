package EXERCISES02;

import java.util.Scanner;

public class GodzillaVsKong05 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        double budget=Double.parseDouble(scanner.nextLine());
        int statists=Integer.parseInt(scanner.nextLine());
        double clothes=Double.parseDouble(scanner.nextLine());

        double priceDecor=budget*0.10;
        double priceClothes=clothes*statists;
        if (statists>150){
            priceClothes=priceClothes-(priceClothes*0.10);
        }
        double totalPrice=priceClothes+priceDecor;
        if (totalPrice>budget){
            System.out.println ("Not enough money!");
            System.out.printf("Wingard needs %.2f leva more.",totalPrice-budget);
        }else {
            System.out.println ("Action!");
            System.out.printf("Wingard starts filming with %.2f leva left.",budget-totalPrice);
        }


    }
}
