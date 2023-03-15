package LAB_09_Augorithms;

import java.util.Arrays;
import java.util.Scanner;

public class E01_Recursive_Array_Sum {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int[] input = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(n -> Integer.parseInt(n))
                .toArray();
        System.out.println(sum(input, 0));
    }
    private static int sum(int[] arr, int fromIndex){
        if (fromIndex == arr.length - 1){
            return arr[fromIndex];
        }
      return arr[fromIndex] + sum(arr,fromIndex + 1);
    }
}
