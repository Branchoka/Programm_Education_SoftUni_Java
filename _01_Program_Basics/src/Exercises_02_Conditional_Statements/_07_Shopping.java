package EXERCISES02;

import java.util.Scanner;

public class Shopping07 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        double budget=Double.parseDouble(scanner.nextLine());
        int cards=Integer.parseInt(scanner.nextLine());
        int processors=Integer.parseInt(scanner.nextLine());
        int RAM=Integer.parseInt(scanner.nextLine());

        double priceCards=cards*250;
        double priceProcessors=priceCards*0.35*processors;
        double priceRAM=priceCards*0.10*RAM;

        double totalPrice=priceCards+priceProcessors+priceRAM;

        if (cards>processors){
            totalPrice=totalPrice-totalPrice*0.15;
        }
        //double diff=Math.abs(totalPrice-budget);

        if (totalPrice<=budget){
            System.out.printf("You have %.2f leva left!",budget-totalPrice);
        }else {
            System.out.printf("Not enough money! You need %.2f leva more!",totalPrice-budget);
        }


    }
}
