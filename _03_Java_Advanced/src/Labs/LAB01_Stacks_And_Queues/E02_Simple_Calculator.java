package LAB01_Stacks_And_Queues;

import java.util.*;

public class E02_Simple_Calculator {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        ArrayDeque<String> stack= new ArrayDeque<>();

        String expression=scanner.nextLine();
        String[] expressionParts=expression.split(" ");
        List<String> partsList= Arrays.asList(expressionParts);

        Collections.reverse(partsList);

        for (String part : partsList){
            stack.push(part);
        }

        while (stack.size() > 1){
            int first=Integer.parseInt(stack.pop());
            String op=stack.pop();
            int second=Integer.parseInt(stack.pop());

            int result;
            switch (op){
                case "+": result=first + second; break;
                case "-": result=first - second; break;
                default:
                    System.out.println("Unknown operation" + op);
                    return;
            }
            stack.push("" + result);
        }
        System.out.println(stack.peek());
    }
}
