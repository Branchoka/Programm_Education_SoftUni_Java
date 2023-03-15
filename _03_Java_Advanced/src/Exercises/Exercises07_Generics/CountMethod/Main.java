package Exercises07_Generics.CountMethod;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

//First Problem for Count Method with String solution:
    /*  CountMethod<String> box = new CountMethod<>();

        for (int i = 0; i < n; i++) {
            String text = scanner.nextLine();
            box.add(text);
        }
        String element = scanner.nextLine();
        System.out.println(box.countGreaterThan(element));*/

//Second Problem for Count Method with Double solution:
        CountMethod<Double> box = new CountMethod<>();

        for (int i = 0; i < n; i++) {
            double number = Double.parseDouble(scanner.nextLine());
            box.add(number);
        }
        double element = Double.parseDouble(scanner.nextLine());
        System.out.println(box.countGreaterThan(element));
    }
}
