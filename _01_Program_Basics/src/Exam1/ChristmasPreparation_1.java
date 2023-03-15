package Exam1;

import java.util.Scanner;

public class ChristmasPreparation_1 {
    public static void main (String []args){
        Scanner scanner=new Scanner(System.in);

        int paper= Integer.parseInt(scanner.nextLine());
        int cloth=Integer.parseInt(scanner.nextLine());
        double glueL=Double.parseDouble(scanner.nextLine());
        int discount=Integer.parseInt(scanner.nextLine());

        double paperPrice= paper * 5.80;
        double clothPrice=cloth * 7.20;
        double glueLPrice=glueL * 1.20;

        double totalPrice= paperPrice + clothPrice + glueLPrice;

        double priceWithDiscount= totalPrice - (totalPrice * discount/100);

        System.out.printf("%.3f",priceWithDiscount);

    }

}
