package Exercises05_Functional_Programming;

import java.util.*;
import java.util.function.Consumer;


public class E01_Consumer_Print {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        String input = scanner.nextLine();
        String[] names = input.split("\\s+");
        Consumer<String> print = w -> System.out.println(w);
        Arrays.stream(names).forEach(elem -> print.accept(elem));



    }
}
