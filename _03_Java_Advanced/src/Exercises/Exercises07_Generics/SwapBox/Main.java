package Exercises07_Generics.SwapBox;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

//First Swap problem with String solution:
        /*  SwapBox<String> box = new SwapBox<>();

        for (int i = 0; i < n; i++) {
            String text = scanner.nextLine();
            box.add(text);
        }
        int firstIndex = scanner.nextInt();
        int secondIndex = scanner.nextInt();

        box.swap(firstIndex,secondIndex);
        System.out.println(box);*/

//Second Swap problem with Integer Solution:
        SwapBox<Integer> box = new SwapBox<>();
        for (int i = 0; i < n; i++) {
            int number = Integer.parseInt(scanner.nextLine());
            box.add(number);
        }
        int firstIndex = scanner.nextInt();
        int secondIndex = scanner.nextInt();
        box.swap(firstIndex,secondIndex);
        System.out.println(box);

    }
}
