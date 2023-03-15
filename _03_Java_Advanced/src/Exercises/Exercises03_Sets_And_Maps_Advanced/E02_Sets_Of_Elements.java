package Exercises03_Sets_And_Maps_Advanced;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class E02_Sets_Of_Elements {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

            String input=scanner.nextLine();
            int sizeOfFirstSet = Integer.parseInt(input.split("\\s+")[0]);
            int sizeOfSecondSet = Integer.parseInt(input.split("\\s+")[1]);

            Set<Integer> firstSet = new LinkedHashSet<>();
            Set<Integer> secondSet = new LinkedHashSet<>();

        for (int numbers = 1; numbers <= sizeOfFirstSet; numbers++) {
            int value = Integer.parseInt(scanner.nextLine());
            firstSet.add(value);
        }
        for (int numbers = 1; numbers <= sizeOfSecondSet; numbers++) {
            int value = Integer.parseInt(scanner.nextLine());
            secondSet.add(value);
        }

        Set<Integer> duplicateElem = new LinkedHashSet<>();
        for (Integer number : firstSet) {
            if (secondSet.contains(number)) {
                duplicateElem.add(number);
            }
        }
        for (Integer integer : duplicateElem) {
            System.out.print(integer + " ");
        }
    }
}
