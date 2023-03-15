package Exercises09_Regular_Expressions;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class E06_Extract_Emails {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        String input = scanner.nextLine();

        String regex = "(?<user>[A-Za-z0-9]+[._-]?[A-Za-z0-9]+)@(?<host>(?<word1>[A-Za-z]+-?[A-Za-z]+)(?<word2>\\.[A-Za-z]+-?[A-Za-z]+)+)";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);

        while (matcher.find()){
            System.out.println(matcher.group());
        }

    }
}
