package Exam2;

import java.util.Scanner;

public class ComputerRoom_03 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        String month=scanner.nextLine();
        int hours=Integer.parseInt(scanner.nextLine());
        int peoples=Integer.parseInt(scanner.nextLine());
        String time =scanner.nextLine();
        boolean spring=
             month.equals("march") ||
           month.equals("april") ||
            month.equals("may");

         boolean summer=
                 month.equals("june") ||
            month.equals("july") ||
            month.equals("august");

           double pricePersonForHour=0;

           if (spring){
               switch (time){
                   case "day":
                       pricePersonForHour=10.50;
                       break;
                   case "night":
                       pricePersonForHour=8.40;
                       break;

               }
           }else if (summer){
               switch (time){
                   case "day":
                       pricePersonForHour=12.60;
                       break;
                   case "night":
                       pricePersonForHour=10.20;
                       break;
               }
           }
           if (hours>=5){
               pricePersonForHour=pricePersonForHour/2;

           }
           if (peoples>=4){
               pricePersonForHour=pricePersonForHour *0.9;
           }
           double totalPrice=peoples *pricePersonForHour*hours;
        System.out.printf("Price per person for one hour: %.2f%n",pricePersonForHour);
        System.out.printf("Total cost of the visit: %.2f",totalPrice);

    }
}
