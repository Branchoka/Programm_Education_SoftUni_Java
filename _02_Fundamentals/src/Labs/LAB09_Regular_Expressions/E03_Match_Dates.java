package LAB09_Regular_Expressions;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class E03_Match_Dates {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        String regex= "(?<day>\\d{2})(?<separator>[\\.\\-\\/])(?<month>[A-Z][a-z]{2})\\2(?<year>\\d{4})";
        String input=scanner.nextLine();

        Pattern pattern=Pattern.compile(regex);
        Matcher matcher=pattern.matcher(input);

        while (matcher.find()){
            String day=matcher.group("day");
            String month= matcher.group("month");
            String year=matcher.group("year");

            System.out.printf("Day: %s, Month: %s, Year: %s%n",day,month,year);
        }
    }
}
