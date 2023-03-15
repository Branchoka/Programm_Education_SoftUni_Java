package Exercises05_Functional_Programming;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;

public class E03_Custom_Min_Function {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        // първи начин
        /* int[] numbers = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt)
                .toArray();

         int smallest = Arrays.stream(numbers).map(v -> v).min().getAsInt();

        System.out.println(smallest);*/

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt)
                .collect(Collectors.toList());

        //втори начин
    /*    Consumer<List<Integer>> printMinNumber = list -> System.out.println(Collections.min(list));
        printMinNumber.accept(numbers);*/

        //трети начин
        Function<List<Integer>,Integer> getMinNumber = list -> Collections.min(numbers);
        System.out.println(getMinNumber.apply(numbers));
    }
}
