package Exercises02_DataTypesAndVariables;

import java.util.Scanner;

public class E01_IntegerOperations {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        int n1=Integer.parseInt(scanner.nextLine());
        int n2=Integer.parseInt(scanner.nextLine());
        int n3=Integer.parseInt(scanner.nextLine());
        int n4=Integer.parseInt(scanner.nextLine());

        int sum1=n1+n2;
        int sum2=sum1/n3;
        int sum3=sum2 * n4;

        System.out.println(sum3);

    }
}
