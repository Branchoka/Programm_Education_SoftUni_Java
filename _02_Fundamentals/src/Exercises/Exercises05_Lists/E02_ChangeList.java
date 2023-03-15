package Exercises05_Lists;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class E02_ChangeList {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        //1.списък с цели числа
        List<Integer> numbersList= Arrays.stream(scanner.nextLine().split(" "))
                                   .map(Integer::parseInt).collect(Collectors.toList());
        //2.получаваме команди докато не стигнем енд
        String command=scanner.nextLine();
        while (!command.equals("end")) {

            if (command.contains("Delete")) {
                int numberForRemove = Integer.parseInt(command.split(" ")[1]);
                numbersList.removeAll(Arrays.asList(numberForRemove));
            } else if (command.contains("Insert")) {

                int element = Integer.parseInt(command.split(" ")[1]);
                int index = Integer.parseInt(command.split(" ")[2]);
                numbersList.add(index, element);
            }

            command = scanner.nextLine();
        }
        for (int number:numbersList){
            System.out.print(number + " ");

        }

    }
}
