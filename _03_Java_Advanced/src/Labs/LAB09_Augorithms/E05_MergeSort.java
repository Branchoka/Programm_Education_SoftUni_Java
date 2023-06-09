package LAB_09_Augorithms;

import java.util.Arrays;
import java.util.Scanner;

public class E05_MergeSort {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        int[] numbers = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(n -> Integer.parseInt(n))
                .toArray();

        int[] sorted = mergeSort(numbers);

        for (int i : sorted) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    private static int[] mergeSort(int[] numbers) {
        if (numbers.length == 1){
            return numbers;
        }
        int middleIndex = numbers.length / 2;
        int[] left = getSubarray(numbers, 0, middleIndex);
        int[] right = getSubarray(numbers, middleIndex, numbers.length);

        int[] leftSorted = mergeSort(left);
        int[] rightSorted = mergeSort(right);

        return merge(leftSorted,rightSorted);
    }

    private static int[] merge(int[] left, int[] right) {
        int[] result = new int[left.length + right.length];
        int lIndex = 0, rIndex = 0, resultIndex = 0;
        for (; lIndex < left.length && rIndex < right.length;resultIndex++) {
            if (left[lIndex] < right[rIndex]){
                result[resultIndex] = left[lIndex];
                lIndex++;
            }else {
                result[resultIndex] = right[rIndex];
                rIndex++;
            }
        }
        if (lIndex == left.length){
            for (; rIndex < right.length;rIndex++ ,resultIndex++) {
                result[resultIndex] = right[rIndex];
            }
        }else if (rIndex == right.length){
            for (; lIndex < left.length; lIndex++,resultIndex++) {
                result[resultIndex] = left[lIndex];
            }
        }
        return result;
    }

    private static int[] getSubarray(int[] numbers, int startInclusive, int endInclusive) {
        int[] result = new int[endInclusive - startInclusive];
        for (int i = startInclusive, j = 0; i < endInclusive;i++, j++) {
            result[j] = numbers[i];
        }
        return result;

    }
}
