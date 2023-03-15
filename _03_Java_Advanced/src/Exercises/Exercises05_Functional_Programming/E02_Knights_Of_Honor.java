package Exercises05_Functional_Programming;

import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Consumer;

public class E02_Knights_Of_Honor {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String input = scanner.nextLine();

        String[] names = input.split("\\s+");

        Consumer<String> print = w -> System.out.println("Sir " + w);
        Arrays.stream(names).forEach(elem -> print.accept(elem));
    }
}
