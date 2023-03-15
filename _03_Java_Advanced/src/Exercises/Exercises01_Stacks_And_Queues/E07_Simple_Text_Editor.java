package Exercises01_Stacks_And_Queues;

import java.util.ArrayDeque;
import java.util.Scanner;

public class E07_Simple_Text_Editor {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        StringBuilder currentText = new StringBuilder();
        ArrayDeque<String> textStack= new ArrayDeque<>();

        for (int commandNumber = 1; commandNumber <= n; commandNumber++) {
            String command=scanner.nextLine();

            if (command.startsWith("1")){
                textStack.push(currentText.toString());
                String textToAppend=command.split("\\s+")[1];
                currentText.append(textToAppend);
            }else if (command.startsWith("2")){
                textStack.push(currentText.toString());

                int count=Integer.parseInt(command.split("\\s+")[1]);
                int startIndexForDelete=currentText.length()-count;
                currentText.delete(startIndexForDelete,currentText.length());

            }else if (command.startsWith("3")){
                int index=Integer.parseInt(command.split("\\s+")[1]);
                System.out.println(currentText.charAt(index - 1));

            }else if (command.startsWith("4")){
                if (!textStack.isEmpty()) {
                    String last = textStack.pop();
                    currentText = new StringBuilder(last);
                }
            }
        }

    }
}
