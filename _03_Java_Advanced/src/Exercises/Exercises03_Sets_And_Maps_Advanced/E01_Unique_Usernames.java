package Exercises03_Sets_And_Maps_Advanced;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class E01_Unique_Usernames {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        int n =Integer.parseInt(scanner.nextLine());
        Set<String> usernames=new LinkedHashSet<>();

        while (--n >= 0){
            String username = scanner.nextLine();
            usernames.add(username);
        }
        for (String username : usernames) {
            System.out.println(username);
        }
    }
}
