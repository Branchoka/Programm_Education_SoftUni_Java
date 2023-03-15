package LAB_04___ForLoop;

import java.util.Scanner;

public class OddEvenSum__10 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        int n=Integer.parseInt(scanner.nextLine());

        int oddSum=0;
        int evenSum=0;

        for (int i = 1; i <= n; i++) {
            int currentNum=Integer.parseInt(scanner.nextLine());

            if (i % 2==0){
                evenSum=evenSum+currentNum;
            }else {
                oddSum=oddSum+currentNum;
            }

        }
        if (oddSum==evenSum){
            System.out.println("Yes");
            System.out.printf("Sum = %d",oddSum);
        }else {
            int diff=Math.abs(oddSum-evenSum);
            System.out.println("No");
            System.out.printf("Diff = %d",diff);
        }
    }
}
