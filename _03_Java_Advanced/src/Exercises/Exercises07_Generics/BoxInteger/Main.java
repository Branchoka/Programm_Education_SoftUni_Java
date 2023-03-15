package Exercises07_Generics.BoxInteger;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        IntegerBox<Integer> box = new IntegerBox<>();

        for (int i = 0; i < n; i++) {
            int element = Integer.parseInt(scanner.nextLine());
            box.add(element);
        }
        System.out.println(box);
    }
}
