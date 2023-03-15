package Exercises03_Sets_And_Maps_Advanced;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class E06_Fix_Emails {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        String name = scanner.nextLine();

        Map<String,String> emailsData = new LinkedHashMap<>();

        while (!name.equals("stop")){
            String email=scanner.nextLine();
            if (!email.endsWith("uk") && !email.endsWith("us") && !email.endsWith("com")){
                emailsData.put(name,email);
            }
            name=scanner.nextLine();
        }
        emailsData.entrySet().removeIf(entry -> entry.getValue().endsWith("uk")
                                        || entry.getValue().endsWith("us")
                                        || entry.getValue().endsWith("com"));

        emailsData.entrySet().forEach(entry -> System.out.println(entry.getKey() + " -> " + entry.getValue()));
    }
}
