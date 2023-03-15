package Exercises01_Basic;

import java.util.Scanner;

public class Orders_09 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        int orders=Integer.parseInt(scanner.nextLine());
        double pricePerCapsule=0;
        int days=0;
        int capsuleCount=0;
        double sum=0;
        double currentNum=0;

        for (int i = 1; i <= orders; i++) {
            pricePerCapsule=Double.parseDouble(scanner.nextLine());
            days=Integer.parseInt(scanner.nextLine());
            capsuleCount=Integer.parseInt(scanner.nextLine());
            currentNum=(days*capsuleCount)*pricePerCapsule;

            System.out.printf("The price for the coffee is: $%.2f%n",currentNum);
            sum=sum +currentNum;
        }
        System.out.printf("Total: $%.2f",sum);


    }
}
