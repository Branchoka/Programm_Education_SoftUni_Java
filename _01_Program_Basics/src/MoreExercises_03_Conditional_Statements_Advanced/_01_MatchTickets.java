package P03MoreExercises_ConditionAdvanced;

import java.util.Scanner;

public class E01_MatchTickets {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        //бюджет за транспорта на групата:
        // •	Oт 1 до 4 – 75% от бюджета.
        //•	От 5 до 9 – 60% от бюджета.
        //•	От 10 до 24 – 50% от бюджета.
        //•	От 25 до 49 – 40% от бюджета.
        //•	50 или повече – 25% от бюджета.

        double budget=Double.parseDouble(scanner.nextLine());
        String typeTicket=scanner.nextLine();
        int peopleOfGroup=Integer.parseInt(scanner.nextLine());

        double priceTicket=0;
        double transport=0;
        double leftSum=0;

        if (peopleOfGroup >= 1 && peopleOfGroup<=4){
            transport=budget*0.75;
        }else if (peopleOfGroup>=5 && peopleOfGroup<=9){
            transport=budget*0.60;
        }else if (peopleOfGroup>=10 && peopleOfGroup<=24){
            transport=budget*0.50;
        }else if (peopleOfGroup>=25 && peopleOfGroup<=49){
            transport=budget*0.40;
        }else if (peopleOfGroup>50){
            transport=budget*0.25;
        }
        if (typeTicket.equals("Normal")){
            priceTicket=peopleOfGroup *249.99;
        }else if (typeTicket.equals("VIP")){
            priceTicket=peopleOfGroup*499.99;
        }

        leftSum = Math.abs ( budget - transport );
        if (priceTicket < leftSum){
            System.out.printf("Yes! You have %.2f leva left.",leftSum - priceTicket);
        }else {
            System.out.printf("Not enough money! You need %.2f leva.",priceTicket - leftSum);
        }
    }
}
