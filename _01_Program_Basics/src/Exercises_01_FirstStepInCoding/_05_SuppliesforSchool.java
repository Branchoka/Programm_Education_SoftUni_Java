package FirststepsinJava;

import java.util.Scanner;

public class SuppliesforSchool_05 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        //•	Брой пакети химикали - цяло число в интервала [0...100]
        //•	Брой пакети маркери - цяло число в интервала [0...100]
        //•	Литри препарат за почистване на дъска - цяло число в интервала [0…50]
        //•	Процент намаление - цяло число в интервала [0...100]
        int pens=Integer.parseInt(scanner.nextLine());
        int markers=Integer.parseInt(scanner.nextLine());
        int liters=Integer.parseInt(scanner.nextLine());
        int percent=Integer.parseInt(scanner.nextLine());

        double pricePens= pens * 5.80;
        double priceMarkers= markers * 7.20;
        double priceLiters= liters * 1.20;
        double allMaterials= pricePens+priceMarkers+priceLiters;

        double totalPrice= allMaterials -(allMaterials*percent/100);
        System.out.println(totalPrice);
        }
    }

