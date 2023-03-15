package LAB_09_Augorithms;

import java.util.Arrays;
import java.util.Scanner;

public class E07_Binary_Search {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        int[] array = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();

        int key = Integer.parseInt(scanner.nextLine());

        System.out.println(binnarySearch(array,key));
    }

    private static int binnarySearch(int[] array, int key) {
        int first = 0;
        int last = array.length - 1;
        int mid = first + (last - first) / 2;
        while (first <= last){
            if (key < array[mid]){
                last = mid - 1;
            }else if (key > array[mid]){
                first = mid + 1;
            }else {
                return (mid);
            }
            mid = first + (last - first) / 2;
        }
        return -1;
    }
}
