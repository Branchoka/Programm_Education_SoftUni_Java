package P02MoreExersicesConditional;

import java.util.Scanner;

public class FuelTank_Part_2 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        String petrol=scanner.nextLine();
        double litersPetrol=Double.parseDouble(scanner.nextLine());
        String clubCard=scanner.nextLine();

        if (petrol.equals("Gas")|| (petrol.equals("Gasoline"))|| (petrol.equals("Diesel"))){
            double fuelPrice=0;

            if (petrol.equals("Gas")){
                fuelPrice=0.93;
                if (clubCard.equals("Yes")){
                    fuelPrice=fuelPrice-0.08;
                }else if (clubCard.equals("No")){
                    fuelPrice=fuelPrice-0.00;
                }
            }else if (petrol.equals("Gasoline")){
                fuelPrice=2.22;
                if (clubCard.equals("Yes")){
                    fuelPrice=fuelPrice-0.18;
                }else if (clubCard.equals("No")){
                    fuelPrice=fuelPrice-0.00;
                }
            }else if (petrol.equals("Diesel")) {
                fuelPrice = 2.33;
                if (clubCard.equals("Yes")) {
                    fuelPrice = fuelPrice - 0.12;
                } else if (clubCard.equals("No")) {
                    fuelPrice = fuelPrice - 0.00;
                }
            }
            double sum=fuelPrice*litersPetrol;
            if (litersPetrol>25){
                sum=sum-sum*0.10;
                System.out.printf("%.2f lv.",sum);
            }else if (litersPetrol>=20 && litersPetrol<=25){
                sum=sum-sum*0.08;
                System.out.printf("%.2f lv.",sum);
            }else {
                sum=sum;
                System.out.printf("%.2f lv.",sum);
            }
        }else {
            System.out.printf("");
        }
    }
}
