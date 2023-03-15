package LAB07_Associative_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class E04_WordFilter {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        String[] input= Arrays.stream(scanner.nextLine().split(" ")).
                filter(w->w.length() % 2 == 0).toArray(String[]::new);

        for (String words:input) {
            System.out.println(words);
        }
    }
}
