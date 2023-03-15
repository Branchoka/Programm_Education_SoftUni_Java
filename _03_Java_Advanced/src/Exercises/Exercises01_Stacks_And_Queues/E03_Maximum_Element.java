package Exercises01_Stacks_And_Queues;

import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class E03_Maximum_Element {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        int n=Integer.parseInt(scanner.nextLine());
        ArrayDeque<Integer> stacks= new ArrayDeque<>();

        for (int i = 1; i <= n; i++) {
            String command=scanner.nextLine();

            if (command.startsWith("1")){
                int commands=Integer.parseInt(command.split("\\s+")[1]);
                stacks.push(commands);

            }else if (command.startsWith("2")){
                stacks.pop();

            }else if (command.startsWith("3")){
                if (stacks.size() > 0){
                    System.out.println(Collections.max(stacks));
                }
            }
        }
    }
}
