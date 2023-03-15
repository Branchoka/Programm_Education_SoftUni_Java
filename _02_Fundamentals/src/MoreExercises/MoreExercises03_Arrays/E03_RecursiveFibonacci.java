package MoreExercises03_Arrays;

import java.util.Scanner;

public class E03_RecursiveFibonacci {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        int positionInFibonacciSequence=Integer.parseInt(scanner.nextLine());

        int[] fibonacciSequence=new int[50];

        fibonacciSequence[0]=1;
        fibonacciSequence[1]=1;

        if (positionInFibonacciSequence >2){
            for (int i = 2; i < positionInFibonacciSequence; i++) {
                fibonacciSequence[i]=fibonacciSequence[i-1] + fibonacciSequence[i-2];
            }
        }
        System.out.println(fibonacciSequence[positionInFibonacciSequence-1]);
    }
}
