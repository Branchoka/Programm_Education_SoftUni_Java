package Exercises01_Basic;

import java.util.Scanner;

public class StrongNumber_06 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        int n=Integer.parseInt(scanner.nextLine());
        int startNum=n;
        int sumFact=0;


        while (n>0) {
            int lastDigit = n % 10;
            int fact = 1;
            for (int i = 1; i <= lastDigit; i++) {
                fact = fact * i;

            }
            sumFact+=fact;

            n = n / 10;
        }
        if (sumFact==startNum){
            System.out.println("yes");
        }else {
            System.out.println("no");
        }
    }
}
