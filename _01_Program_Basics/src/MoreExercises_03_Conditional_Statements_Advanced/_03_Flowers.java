package P03MoreExercises_ConditionAdvanced;

import java.util.Scanner;

public class E03_Flowers {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        //•	За закупени повече от 7 лалета през пролетта – 5% от цената на целият букет.
        //•	За закупени 10 или повече рози през зимата – 10% от цената на целият букет.
        //•	За закупени повече от 20 цветя общо през всички сезони – 20% от цената на целият букет.

            int chrysanthemums=Integer.parseInt(scanner.nextLine());
            int roses=Integer.parseInt(scanner.nextLine());
            int tulips=Integer.parseInt(scanner.nextLine());
            String season=scanner.nextLine();
            String holiday=scanner.nextLine();

            double priceChrysanthemums=0;
            double priceRoses=0;
            double priceTulips=0;
            double flowersPrice=0;
            int totalFlowers=chrysanthemums+roses+tulips;

            if (season.equals("Spring") || (season.equals("Summer"))){
                priceChrysanthemums=chrysanthemums * 2.00;
                priceRoses=roses * 4.10;
                priceTulips=tulips * 2.50;
                flowersPrice=priceChrysanthemums + priceRoses + priceTulips;

            }else if (season.equals("Autumn") || (season.equals("Winter"))){
               priceChrysanthemums=chrysanthemums * 3.75;
               priceRoses=roses * 4.50;
               priceTulips=tulips * 4.15;
               flowersPrice=priceChrysanthemums+priceRoses+priceTulips;
            }

            if (holiday.equals("N")){
                flowersPrice=priceChrysanthemums+priceRoses+priceTulips;
            }else if (holiday.equals("Y")){
                flowersPrice=flowersPrice + (flowersPrice * 0.15);
            }

            if ((tulips > 7) && (season.equals("Spring"))){
                flowersPrice=flowersPrice - (flowersPrice * 0.05);
            }
            if ((roses >=10) && (season.equals("Winter"))){
                flowersPrice=flowersPrice - (flowersPrice * 0.10);
            }
            if (totalFlowers>20){
                flowersPrice=flowersPrice - (flowersPrice * 0.20);
            }
        System.out.printf("%.2f",flowersPrice + 2);
    }
}
