package FirststepsinJava;

import java.util.Scanner;

public class BasketballEquipment_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //•	Баскетболни кецове – цената им е 40% по-малка от таксата за една година
        //•	Баскетболен екип – цената му е 20% по-евтина от тази на кецовете
        //•	Баскетболна топка – цената ѝ е 1 / 4 от цената на баскетболния екип
        //•	Баскетболни аксесоари – цената им е 1 / 5 от цената на баскетболната топка
        double tax=Double.parseDouble(scanner.nextLine());

        double priceSneakers = tax-(tax * 0.40);
        double priceEquipment =priceSneakers-(priceSneakers * 0.20);
        double priceBall = priceEquipment / 4;
        double accessories =priceBall / 5;
        double finalPrice=tax+priceSneakers+priceEquipment+priceBall+accessories;

        System.out.println(finalPrice);
    }
}
