package Exercises03_Arrays;

import java.util.Scanner;

public class E01_Train {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        int n=Integer.parseInt(scanner.nextLine());

        int[] peoples= new int[n];
        int sum=0;

        for (int i = 0; i < n; i++) {
            int peopleCount=Integer.parseInt(scanner.nextLine());
            sum+=peopleCount;
            for (int j = 0; j <peoples.length ; j++) {
                peoples[i]=peopleCount;
            }
        }
        for (int i = 0; i < peoples.length; i++) {
            System.out.print(peoples[i] + " ");
        }
        System.out.println();
        System.out.println(sum);



    }
}
