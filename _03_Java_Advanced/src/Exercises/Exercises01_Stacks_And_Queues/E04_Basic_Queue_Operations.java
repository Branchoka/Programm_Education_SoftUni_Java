package Exercises01_Stacks_And_Queues;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Scanner;

public class E04_Basic_Queue_Operations {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        int n=scanner.nextInt();//брой елементи
        int s=scanner.nextInt();//брой елементи които трябва да махнем
        int x=scanner.nextInt();//число което проверявам дали го има в стека

        ArrayDeque<Integer> queue = new ArrayDeque<>();

        for (int count = 1; count <= n; count++) {
            queue.add(scanner.nextInt());
        }
        for (int countS = 1; countS <= s; countS++) {
            queue.poll();
        }
        if (queue.contains(x)){
            System.out.println("true");
        }else {
            if (queue.isEmpty()) {
                System.out.println(0);
            } else {
                System.out.println(Collections.min(queue));
            }
        }

    }
}
