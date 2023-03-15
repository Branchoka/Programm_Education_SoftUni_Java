package Exercises03_Sets_And_Maps_Advanced;

import java.util.Scanner;

public class E07_Hands_Of_Cards {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String input = scanner.nextLine();


        while (!input.equals("JOKER")){
            String name = input.split("\\s+")[0];
            String combination = input.split("\\s+")[1];





            input=scanner.nextLine();
        }
    }
}
