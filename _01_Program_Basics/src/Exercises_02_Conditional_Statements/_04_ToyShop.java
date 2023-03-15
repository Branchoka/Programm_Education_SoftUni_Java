package EXERCISES02;

import java.util.Scanner;

public class ToyShop04 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        double holidayPrice=Double.parseDouble(scanner.nextLine());
        int puzzles=Integer.parseInt(scanner.nextLine());
        int dolls=Integer.parseInt(scanner.nextLine());
        int bears=Integer.parseInt(scanner.nextLine());
        int minions=Integer.parseInt(scanner.nextLine());
        int trucks=Integer.parseInt(scanner.nextLine());

        double puzzlePrice=puzzles*2.60;
        double dollsPrice=dolls*3;
        double bearsPrice=bears*4.10;
        double minionsPrice=minions*8.20;
        double trucksPrice=trucks*2;

        double  profit=puzzlePrice+dollsPrice+bearsPrice+minionsPrice+trucksPrice;
        int Toys=puzzles+dolls+bears+minions+trucks;

        if (Toys>=50){
            profit=profit-(profit*0.25);

        }
        double totalPrice=profit-(profit*0.10);

        if (totalPrice>=holidayPrice){
            System.out.printf("Yes! %.2f lv left.",totalPrice-holidayPrice);
        }else {
            System.out.printf("Not enough money! %.2f lv needed.",holidayPrice-totalPrice);
        }
    }
}
