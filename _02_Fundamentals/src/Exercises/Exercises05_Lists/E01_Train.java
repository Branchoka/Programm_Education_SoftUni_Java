package Exercises05_Lists;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class E01_Train {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        List<Integer> wagonsList= Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        //maxCapacitet e максималният брой на хора които могат да се добавят във вагоните
        int maxCapacitet=Integer.parseInt(scanner.nextLine());

        String command=scanner.nextLine();

        //когато командата е add,трябва на първият ред да се добавят вагони в който да има даден брой пасажери
        //2ро да се провери в кой вагон могат да се поберат всички пътници /проверка от първи вагон
        while (!command.equals("end")){
            String[] commandData=command.split(" "); //["Add","5"],разделя командата на отделни части
                                                            //или е някакво число,което да се добавя
            if (commandData[0].equals("Add")){
                int passengers=Integer.parseInt(commandData[1]);
                wagonsList.add(passengers); //добавя ги в края
            }else {
                //команда при която получаваме число
                int passengersToAdd=Integer.parseInt(commandData[0]);
                for (int index = 0; index < wagonsList.size(); index++) {
                    int wagon=wagonsList.get(index);

                    if (wagon + passengersToAdd <= maxCapacitet) {
                        wagonsList.set(index,wagon+passengersToAdd);
                        break;
                    }
                }

            }

            command=scanner.nextLine();
        }
        for (int train: wagonsList){
            System.out.print(" " + train);
        }

    }
}
