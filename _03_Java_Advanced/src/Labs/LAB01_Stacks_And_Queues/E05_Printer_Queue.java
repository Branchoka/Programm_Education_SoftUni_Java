package LAB01_Stacks_And_Queues;

import java.util.ArrayDeque;
import java.util.Scanner;

public class E05_Printer_Queue {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        String currentInput=scanner.nextLine();

        ArrayDeque<String> queue = new ArrayDeque<>();
        while (!currentInput.equals("print")){
            if (currentInput.equals("cancel")){
                if (queue.isEmpty()){
                    System.out.println("Printer is on standby");
                }else {
                    System.out.println("Canceled " + queue.poll());
                }
            }else {
                queue.offer(currentInput);
            }

            currentInput=scanner.nextLine();
        }
        while (!queue.isEmpty()){
            System.out.println(queue.poll());
        }
    }
}
