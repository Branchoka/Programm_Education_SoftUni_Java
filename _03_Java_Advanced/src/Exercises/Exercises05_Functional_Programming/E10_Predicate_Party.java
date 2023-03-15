package Exercises05_Functional_Programming;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class E10_Predicate_Party {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        List<String> people = Arrays.stream(scanner.nextLine().split(" ")).collect(Collectors.toList());

        String command = scanner.nextLine();

        while (!command.equals("Party!")){
            Predicate<String> predicate = null;

            String criteria = command.split("\\s+")[2];

            if (command.contains("Length")){
                predicate = x -> x.length() == Integer.parseInt(criteria);
            }else if (command.contains("StartsWith")){
                predicate = x -> x.startsWith(criteria);
            }else {
                predicate = x -> x.endsWith(criteria);
            }
            if (command.contains("Remove")){
                List<String> toRemove = new ArrayList<>();
                for (String guest : people) {
                    if (predicate.test(guest)){
                        toRemove.add(guest);
                    }
                }
                people.removeAll(toRemove);
            }else {
                List<String> toAdd = new ArrayList<>();
                for (String person : people) {
                    if (predicate.test(person)){
                        toAdd.add(person);
                    }
                }
                people.addAll(toAdd);
            }
            command = scanner.nextLine();
        }
        if (people.isEmpty()){
            System.out.println("Nobody is going to the party!");
        }else {
            System.out.println(people.stream().sorted().collect(Collectors.toCollection(ArrayList::new))
                    .toString().replaceAll("([\\[\\]])","") + " are going to the party!");
        }
    }
}
