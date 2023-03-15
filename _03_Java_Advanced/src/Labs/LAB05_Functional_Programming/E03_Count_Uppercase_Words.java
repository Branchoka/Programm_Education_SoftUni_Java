package LAB05_Functional_Programming;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class E03_Count_Uppercase_Words {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        Predicate<String> startsWithUpperCase = word -> Character.isUpperCase(word.charAt(0));
        Consumer<String> print = word -> System.out.println(word);

        List<String> upperCaseWord = Arrays.stream(scanner.nextLine().split(" "))
                .filter(w -> startsWithUpperCase.test(w))
                .collect(Collectors.toList());

        System.out.println(upperCaseWord.size());
        upperCaseWord.forEach(elem -> print.accept(elem));
    }
}
