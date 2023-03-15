package LAB05_Functional_Programming;

import org.w3c.dom.ranges.Range;

import java.util.Scanner;
import java.util.function.Predicate;
import java.util.stream.IntStream;

public class E06_Find_Evens_Or_Odds {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        String[] input = scanner.nextLine().split(" ");
        int lowerBound = Integer.parseInt(input[0]);
        int upperBound = Integer.parseInt(input[1]);

        String oddOrEven = scanner.nextLine();

        Predicate<Integer> filterCondition =
                oddOrEven.equals("odd") ?
                        (x -> x % 2 != 0) :
                        (x -> x % 2 == 0);

        IntStream.range(lowerBound,upperBound + 1)
                .filter(num -> filterCondition.test(num))
                .forEach(e -> System.out.print(e + " "));

    }
}
