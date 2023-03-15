package FirststepsinJava;

import java.util.Scanner;

public class FoodDelivery_07 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
       //•	Брой пилешки менюта – цяло число в интервала [0 … 99]
        //•	Брой менюта с риба – цяло число в интервала [0 … 99]
        //•	Брой вегетариански менюта – цяло число в интервала [0 … 99
        int chickenMenu=Integer.parseInt(scanner.nextLine());
        int fishMenu=Integer.parseInt(scanner.nextLine());
        int vegetariansMenu=Integer.parseInt(scanner.nextLine());

        double priceForChicken=chickenMenu*10.35;
        double priceForFish=fishMenu*12.40;
        double priceForVegetarians=vegetariansMenu*8.15;
        double allPrice=priceForChicken+priceForFish+priceForVegetarians;
        double desert=allPrice * 0.20;
        double finalPrice=allPrice+desert+2.50;
        System.out.println(finalPrice);

    }
}
