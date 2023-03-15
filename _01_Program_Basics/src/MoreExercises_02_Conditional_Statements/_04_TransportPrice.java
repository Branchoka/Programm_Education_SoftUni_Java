package P02MoreExersicesConditional;

import java.util.Scanner;

public class TransportPrice_04 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        int n=Integer.parseInt(scanner.nextLine());
        String dayOrNight=scanner.nextLine();
        double price=0;

        if (dayOrNight.equals("day")) {
            if (n < 20) {
                price = (n * 0.79) + 0.70;
            }
        }if (dayOrNight.equals("night")) {
            if (n < 20) {
                price = (n * 0.90) + 0.70;
            }
        }
             if (n>=20 && n<=100){
                price=n* 0.09;
            }
            else if (n>100){
                price=n* 0.06;
            }

        System.out.printf("%.2f%n",price);
    }
}
