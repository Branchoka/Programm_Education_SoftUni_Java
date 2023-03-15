package Exercises05_Lists;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class E04_ListOperations {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);

        List<Integer> numbersList= Arrays.stream(scanner.nextLine().split(" "))
                                   .map(Integer::parseInt)
                                   .collect(Collectors.toList());

        String command=scanner.nextLine();

        while (!command.equals("End")){
            if (command.contains("Add")){
              int numberToAdd=Integer.parseInt(command.split(" ")[1]);
              numbersList.add(numberToAdd);

            }else if (command.contains("Insert")){
                int numberToInsert=Integer.parseInt(command.split("\\s+")[1]);
                int index=Integer.parseInt(command.split("\\s+")[2]);

                if (isValidIndex(index,numbersList)){
                    numbersList.add(index,numberToInsert);
                }else {
                    System.out.println("Invalid index");
                }


            }else if (command.contains("Remove")){
                int numberToRemove=Integer.parseInt(command.split(" ")[1]);

                if (isValidIndex(numberToRemove,numbersList)){
                    numbersList.remove(numberToRemove);
                }else {
                    System.out.println("Invalid index");
                }


            }else if (command.contains("Shift left")){
                int countShiftLeft=Integer.parseInt(command.split(" ")[2]);
                for (int time= 1;time <= countShiftLeft;time++){
                    int firstNum=numbersList.get(0);
                    numbersList.remove(0);
                    numbersList.add(firstNum);
                }

            }else if (command.contains("Shift right")){
                int countShiftRight=Integer.parseInt(command.split(" ")[2]);
                for (int time = 1; time <=countShiftRight ; time++) {
                    int lastNum=numbersList.get(numbersList.size()-1);
                    numbersList.remove(numbersList.size()-1);
                    numbersList.add(0,lastNum);
                }
            }


            command=scanner.nextLine();
        }
        for (int number:numbersList){
            System.out.print(number + " ");

        }

    }

    public static boolean isValidIndex(int index,List<Integer> numberList){
        return  index >=0 && index<=numberList.size()-1;


    }
}
