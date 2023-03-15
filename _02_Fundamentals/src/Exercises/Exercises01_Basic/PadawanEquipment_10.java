package Exercises01_Basic;

import java.util.Scanner;

public class PadawanEquipment_10 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        double amount=Double.parseDouble(scanner.nextLine());
        int countStudents=Integer.parseInt(scanner.nextLine());
        double priceLightSaber=Double.parseDouble(scanner.nextLine());
        double priceRobes=Double.parseDouble(scanner.nextLine());
        double priceBelts=Double.parseDouble(scanner.nextLine());

        double sumLight= Math.ceil(countStudents+0.10*countStudents)*priceLightSaber;
        double sumRobes=countStudents*priceRobes;
        double sumBelts=(countStudents - countStudents/ 6)*priceBelts;

        double totalSum=sumLight+sumRobes+sumBelts;

        if (totalSum<=amount){
            System.out.printf("The money is enough - it would cost %.2flv.",totalSum);
        }else {
            double needMoney=totalSum-amount;
            System.out.printf("George Lucas will need %.2flv more.",needMoney);
        }
    }
}
