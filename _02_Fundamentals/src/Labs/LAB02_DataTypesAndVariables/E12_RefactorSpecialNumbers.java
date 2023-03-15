package LAB02_DataTypesAndVariables;

import java.util.Scanner;

public class E12_RefactorSpecialNumbers {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        int n=Integer.parseInt(scanner.nextLine());
        int sum=0;
        String True="True";
        String False="False";

        for (int i = 1; i <= n; i++) {
            int currentNum = i;
            while (i > 0) {
                sum = sum + (i % 10);
                i= i / 10;

            }
            if (sum == 5 || sum == 7 || sum == 11) {
                System.out.printf("%d -> %s%n",currentNum,True);
            }else {
                System.out.printf("%d -> %s%n", currentNum, False);
            }

            sum=0;
            i=currentNum;
        }


    }
}
