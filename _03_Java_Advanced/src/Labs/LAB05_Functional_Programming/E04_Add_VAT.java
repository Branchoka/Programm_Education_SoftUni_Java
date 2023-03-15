package LAB05_Functional_Programming;

import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Function;

public class E04_Add_VAT {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        Function<String,Double> parse = str -> Double.parseDouble(str);
        Function<Double,Double> addVat = d -> d * 1.2;
        Consumer<Double> print = num -> System.out.printf("%.2f%n",num);

        System.out.println("Prices with VAT: ");
        Arrays.stream(scanner.nextLine().split(", "))
                    .map(w -> parse.apply(w))
                .map(price -> addVat.apply(price))
                .forEach(priceWithVat -> print.accept(priceWithVat));
    }
}
