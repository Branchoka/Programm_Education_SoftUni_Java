package Exercises07_Generics.CustomList;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        CustomList<String> customList = new CustomList<>();
        String command = scanner.nextLine();
        while (!command.equals("END")){
            String commandType = command.split("\\s+")[0];
            switch (commandType){
                case "Add":
                    String elementForAdd = command.split("\\s+")[1];
                    customList.add(elementForAdd);
                    break;
                case "Remove":
                    int elemForRemove = Integer.parseInt(command.split("\\s+")[1]);
                    customList.remove(elemForRemove);
                    break;
                case "Contains":
                    String text = command.split("\\s+")[1];
                    System.out.println(customList.contains(text));
                    break;
                case "Swap":
                    int firstIndex = Integer.parseInt(command.split("\\s+")[1]);
                    int secondIndex = Integer.parseInt(command.split("\\s+")[2]);
                    customList.swap(firstIndex,secondIndex);
                    break;
                case "Greater":
                    String elementToCheck = command.split("\\s+")[1];
                    System.out.println(customList.countGreaterThan(elementToCheck));
                    break;
                case "Max":
                    System.out.println(customList.getMax());
                    break;
                case "Min":
                    System.out.println(customList.getMin());
                    break;
                case "Print":
                    customList.print();
                    break;
            }
            command = scanner.nextLine();
        }
    }
}
