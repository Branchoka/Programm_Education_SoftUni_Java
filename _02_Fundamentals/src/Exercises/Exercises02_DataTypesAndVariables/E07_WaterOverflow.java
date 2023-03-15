package Exercises02_DataTypesAndVariables;

import java.util.Scanner;

public class E07_WaterOverflow {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        int n=Integer.parseInt(scanner.nextLine());
        int quantity=0;

        for (int i = 1; i <= n; i++) {
            int liters=Integer.parseInt(scanner.nextLine());


            if (quantity + liters >255){
                System.out.println("Insufficient capacity!");
                continue;
            }
            quantity=quantity+liters;
        }
        System.out.printf("%d",quantity);


    }
}
