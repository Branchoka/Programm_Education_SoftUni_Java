package Exercises06_Defining_Classes.E01_Opinion_Poll;


import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        List<Opinion_Poll> person = new ArrayList<>();

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            String[] pollParts = scanner.nextLine().split("\\s+");
            Opinion_Poll poll = new Opinion_Poll(pollParts[0], Integer.parseInt(pollParts[1]));

            person.add(poll);
        }
            person.stream().filter(people -> people.getAge()> 30)
                    .sorted(Comparator.comparing(Opinion_Poll::getName))
                    .forEach(System.out::println);

    }
}
