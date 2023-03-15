package Exercises01_Stacks_And_Queues;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Scanner;

public class E02_Basic_Stack_Operations {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        int numStacks=scanner.nextInt();//брой елементи
        int s=scanner.nextInt();//брой елементи които трябва да махнем
        int x=scanner.nextInt();//число което проверявам дали го има в стека

        ArrayDeque<Integer> stacks = new ArrayDeque<>();

        for (int count = 1; count <= numStacks; count++) {
            stacks.push(scanner.nextInt());
        }
        for (int countS = 1; countS <= s; countS++) {
            stacks.pop();
        }
        if (stacks.contains(x)){
            System.out.println("true");
        }else {
           if (stacks.isEmpty()){
               System.out.println(0);
           }else {
               System.out.println(Collections.min(stacks));
           }
       }
    }
}
