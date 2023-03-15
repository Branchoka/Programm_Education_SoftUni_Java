package Exam1;

import java.util.Scanner;

public class SantasHoliday_03 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        int days=Integer.parseInt(scanner.nextLine());
        String typeRoom=scanner.nextLine();
        String rating=scanner.nextLine();

        double priceForHoliday=0;

        switch (typeRoom){
            case "room for one person":
                priceForHoliday=(days-1) * 18.0;
                break;
            case "apartment":
                priceForHoliday=(days-1)* 25.0;
                if (days<10){
                    priceForHoliday=priceForHoliday-(priceForHoliday*0.30);
                }else if (days>10 && days<=15){
                    priceForHoliday=priceForHoliday-(priceForHoliday*0.35);
                }else if (days>15){
                    priceForHoliday=priceForHoliday-(priceForHoliday*0.50);
                }
                break;
            case "president apartment":
                priceForHoliday=(days-1)* 35.0;
                if (days<10){
                    priceForHoliday=priceForHoliday-(priceForHoliday*0.10);
                }else if (days>10 && days<=15){
                    priceForHoliday=priceForHoliday-(priceForHoliday*0.15);
                }else if (days>15){
                    priceForHoliday=priceForHoliday-(priceForHoliday*0.20);
                }
                break;

        }if (rating.equals("positive")){
            priceForHoliday=priceForHoliday+(priceForHoliday*0.25);
        }else if (rating.equals("negative")){
            priceForHoliday=priceForHoliday-(priceForHoliday*0.10);
        }
        System.out.printf("%.2f",priceForHoliday);
    }
}
