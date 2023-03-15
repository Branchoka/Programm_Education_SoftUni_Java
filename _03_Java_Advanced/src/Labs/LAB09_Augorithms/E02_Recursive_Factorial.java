package LAB_09_Augorithms;

import java.util.Scanner;

public class E02_Recursive_Factorial {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        System.out.println(factorial(n));
    }

    private static int factorial(int n) {
        if (n == 0){
            return 1;
        }
        return n * factorial(n - 1);
    }
}
