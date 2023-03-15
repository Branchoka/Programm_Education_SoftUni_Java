package LAB09_Regular_Expressions;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class E02_Match_Phone_Number {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        String regex="\\+359([- ])2\\1[\\d]{3}\\1[\\d]{4}\\b";
        String input=scanner.nextLine();

        Pattern pattern=Pattern.compile(regex);
        Matcher matcher= pattern.matcher(input);

        List<String> matchesPhones=new ArrayList<>();
        while (matcher.find()){
            matchesPhones.add(matcher.group());

        }
        System.out.println(String.join(", ",matchesPhones));



    }
}
