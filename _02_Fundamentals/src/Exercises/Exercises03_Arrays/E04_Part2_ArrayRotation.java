package Exercises03_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class E04_Part2_ArrayRotation {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        int[] numbers= Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        int rotation=Integer.parseInt(scanner.nextLine());

        for (int rotations = 1; rotations <= rotation ; rotations++) {
            int firstElement=numbers[0];

            for (int index = 0; index < numbers.length - 1 ; index++) {
                numbers[index]=numbers[index + 1];
            }

            numbers[numbers.length-1]=firstElement;
        }
        for (int number:numbers){
            System.out.print(number + " ");
        }
    }
}
