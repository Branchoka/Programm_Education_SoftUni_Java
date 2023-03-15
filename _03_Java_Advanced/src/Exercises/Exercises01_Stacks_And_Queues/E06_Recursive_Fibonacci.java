package Exercises01_Stacks_And_Queues;

import java.util.Scanner;

public class E06_Recursive_Fibonacci {
    public static long[] memoryForFibunacci;
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        memoryForFibunacci=new long[n + 1];

        System.out.println(fib(n));
    }
    public static long fib (int n){
        if (n <= 1){
            return 1;
        }
        if (memoryForFibunacci[n] != 0){
            return memoryForFibunacci[n];
        }
        return memoryForFibunacci[n]= fib(n - 1) + fib(n - 2);
    }
}
