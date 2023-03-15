package Exercises01_Basic;

import java.util.Scanner;

public class Vacation_03 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        int NumPeople=Integer.parseInt(scanner.nextLine());
        String typeOfGroup=scanner.nextLine();
        String day=scanner.nextLine();
        double price=0;


        if (typeOfGroup.equals("Students")){
            if (day.equals("Friday")){
                price=8.45;
            }else if (day.equals("Saturday")){
                price=9.80;
            }else if (day.equals("Sunday")){
                price=10.46;
            }
        }
        if (typeOfGroup.equals("Business")) {
            if (day.equals("Friday")) {
                price = 10.90;
            } else if (day.equals("Saturday")) {
                price = 15.60;
            } else if (day.equals("Sunday")) {
                price = 16;
            }
        }
        if (typeOfGroup.equals("Regular")){
            if (day.equals("Friday")) {
                price = 15;
            } else if (day.equals("Saturday")) {
                price = 20;
            } else if (day.equals("Sunday")) {
                price = 22.50;
            }
        }
        double totalPrice=price*NumPeople;

        if (typeOfGroup.equals("Students") && NumPeople >=30){
            totalPrice=totalPrice - (totalPrice * 0.15);
        }else if (typeOfGroup.equals("Business") && NumPeople >= 100){
            totalPrice=(NumPeople-10) * price;
        }else if (typeOfGroup.equals("Regular") && NumPeople>=10 && NumPeople<=20){
            totalPrice=totalPrice- (totalPrice* 0.05);
        }
        System.out.printf("Total price: %.2f",totalPrice);
    }
}
