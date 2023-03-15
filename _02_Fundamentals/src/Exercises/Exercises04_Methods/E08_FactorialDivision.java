package Exercises04_Methods;

import java.util.Scanner;

public class E08_FactorialDivision {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        int number1=Integer.parseInt(scanner.nextLine());
        int number2=Integer.parseInt(scanner.nextLine());

        long fact1=getFactOfNum1(number1);
        long fact2=getFactNum2(number2);
        double divisionResult=fact1 * 1.0 /fact2;
        System.out.printf("%.2f",divisionResult);

    }
    public static long getFactOfNum1(int num1){
        long fact=1;
        for (int i = 1; i <= num1; i++) {
            fact=fact * i;

        }
        return fact;


    }
    public static long getFactNum2(int num2){
        long fact=1;
        for (int i = 1; i <= num2; i++) {
            fact=fact * i;

        }
        return fact;

    }
}
