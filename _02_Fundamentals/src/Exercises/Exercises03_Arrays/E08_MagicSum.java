package Exercises03_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class E08_MagicSum {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        int[] numbers= Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        int MagicSum=Integer.parseInt(scanner.nextLine());

        //трябва да се провери на кои 2 числа сумата им е равно на дадената сума
        for (int index = 0; index < numbers.length; index++) {
            int currentNum=numbers[index];
            for (int inIndex = index+1; inIndex <numbers.length; inIndex++) {
                int inNum=numbers[inIndex];
                if (currentNum + inNum == MagicSum){
                    System.out.println(currentNum + " " + inNum);
                }
            }
        }

    }
}
