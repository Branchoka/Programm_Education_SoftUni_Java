package Exercises03_Arrays;

import java.util.Scanner;

public class E04_ArrayRotation {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        String[] Arr =scanner.nextLine().split(" ");
        int countRotation=Integer.parseInt(scanner.nextLine());

        for (int rotation = 1; rotation <= countRotation; rotation++){
            String firstElement=Arr[0];

        for (int index = 0; index < Arr.length - 1; index++) {
            Arr[index] = Arr[index + 1];

        }
            Arr[Arr.length - 1] = firstElement;
        }
        for (String arr: Arr){
            System.out.print(arr + " ");
        }
    }
}
