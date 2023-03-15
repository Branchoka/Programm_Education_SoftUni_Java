package Exam2;

import java.util.Scanner;

public class ComputerRoom__03 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        String month=scanner.nextLine();
        int hours=Integer.parseInt(scanner.nextLine());
        int people=Integer.parseInt(scanner.nextLine());
        String time=scanner.nextLine();

        double pricePerPerson=0;

        switch (month){
            case "march":
            case "april":
            case "may":
            if (time.equals("day")){
                pricePerPerson=10.50;
            }else if (time.equals("night")){
                pricePerPerson=8.40;
            }
            break;
            case "june":
            case "july":
            case "august":
                if (time.equals("day")){
                    pricePerPerson=12.60;
                }else if (time.equals("night")){
                    pricePerPerson=10.20;
                }
                break;
        }
       double Price=pricePerPerson*people*hours;


        if (people < 4){
            System.out.printf("Price per person for one hour: %.2f%n", pricePerPerson);
            System.out.printf("Total cost of the visit: %.2f",Price);
        }if (people >= 4){
            double count=(pricePerPerson * 0.90);
            double s=count * 0.50;
            double all=s * people * count;
            System.out.printf("Price per person for one hour: %.2f%n",s);
            System.out.printf("Total cost of the visit: %.2f",all);
        }

    }
}
