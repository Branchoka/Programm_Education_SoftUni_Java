package Exam1;

import java.util.Scanner;

public class MaidenParty_02 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        double partyPrice=Double.parseDouble(scanner.nextLine());
        int messages=Integer.parseInt(scanner.nextLine());
        int roses=Integer.parseInt(scanner.nextLine());
        int keys=Integer.parseInt(scanner.nextLine());
        int cartoons=Integer.parseInt(scanner.nextLine());
        int surprises=Integer.parseInt(scanner.nextLine());

        double messagesPrice=messages * 0.60;
        double rosesPrice=roses * 7.20;
        double keysPrice= keys * 3.60;
        double cartoonsPrice=cartoons * 18.20;
        double surprisesPrice=surprises * 22.0;

        double profit= messagesPrice+rosesPrice+keysPrice+cartoonsPrice+surprisesPrice;
        int items=messages+roses+keys+cartoons+surprises;

        if (items>=25){
            profit=profit -(profit *0.35);
        }
        double totalPrice= profit-(profit*0.10);

        if (totalPrice>=partyPrice){
            System.out.printf("Yes! %.2f lv left.",totalPrice-partyPrice);
        }else {
            System.out.printf("Not enough money! %.2f lv needed.",partyPrice-totalPrice);
        }
    }
}
