package P03MoreExercises_ConditionAdvanced;

import java.util.Scanner;

public class E02_BikeRace {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        int numsJuniors=Integer.parseInt(scanner.nextLine());
        int numsSeniors=Integer.parseInt(scanner.nextLine());
        String route=scanner.nextLine();

        double feeForJuniors=0;
        double feeForSeniors=0;
        double totalTax=0;
        double result=0;

        int people=numsJuniors+numsSeniors;


        if ("trail".equals(route)) {
            feeForJuniors = numsJuniors * 5.50;
            feeForSeniors = numsSeniors * 7;
            totalTax = feeForJuniors+feeForSeniors;
        } else if ("downhill".equals(route)) {
            feeForJuniors = numsJuniors * 12.25;
            feeForSeniors = numsSeniors * 13.75;
            totalTax = feeForJuniors+feeForSeniors;
        } else if ("road".equals(route)) {
            feeForJuniors = numsJuniors * 20;
            feeForSeniors = numsSeniors * 21.50;
            totalTax = feeForJuniors+feeForSeniors;
        } else if ("cross-country".equals(route)) {
            feeForJuniors = numsJuniors * 8;
            feeForSeniors = numsSeniors * 9.50;
            totalTax = feeForJuniors+feeForSeniors;
        }
        if (people >= 50 ){
            totalTax=(feeForJuniors+feeForSeniors) - ((feeForJuniors+feeForSeniors) * 0.25);


        }
        result=totalTax- (totalTax * 0.05);
        System.out.printf("%.2f",result);

    }
}
