package Exercises03;

import java.util.Scanner;

public class NewHouse_03 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String typeFlower=scanner.nextLine();
        int flower=Integer.parseInt(scanner.nextLine());
        int budget=Integer.parseInt(scanner.nextLine());

        double totalPrice=0;

        switch (typeFlower){
            case "Roses":
                totalPrice=flower*5;
                if (flower>80){
                    totalPrice=totalPrice-(totalPrice*0.10);
                }
                break;

            case "Dahlias":
                totalPrice=flower*3.80;
                if (flower>90){
                    totalPrice=totalPrice-(totalPrice*0.15);
                }
                break;

            case "Tulips":
                totalPrice=flower*2.80;
                if (flower>80){
                    totalPrice=totalPrice-(totalPrice*0.15);
                }
                break;

            case "Narcissus":
                totalPrice=flower*3;
                if (flower<120){
                    totalPrice=totalPrice+(totalPrice*0.15);
                }
                break;

            case "Gladiolus":
                totalPrice=flower*2.50;
                if (flower<80){
                    totalPrice=totalPrice+(totalPrice*0.20);
                }
                break;
        }
        double diff=Math.abs(budget-totalPrice);
        if (totalPrice<=budget){
            System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.",flower,typeFlower,diff);
        }else {
            System.out.printf("Not enough money, you need %.2f leva more.",diff);
        }
    }
}
