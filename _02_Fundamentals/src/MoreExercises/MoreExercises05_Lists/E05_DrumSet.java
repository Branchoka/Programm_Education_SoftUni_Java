package MoreExercises05_Lists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class E05_DrumSet {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        double moneyAvailable=Double.parseDouble(scanner.nextLine());

        List<Integer> drumList= Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        List<Integer> drumsListStartingPoint=new ArrayList<>();

        drumsListStartingPoint.addAll(drumList);

        String command=scanner.nextLine();

        while (!command.equals("Hit it again, Gabsy!")){
            int damagePower=Integer.parseInt(command);

            for (int i = 0; i < drumList.size(); i++) {
                int currentDrum=drumList.get(i);

                currentDrum=currentDrum-damagePower;
                drumList.set(i,currentDrum);

                if (currentDrum < 0){
                    double neededMoney=drumsListStartingPoint.get(i)*3;
                    if (moneyAvailable-neededMoney>0){
                        currentDrum=drumsListStartingPoint.get(i);
                        moneyAvailable=moneyAvailable-drumsListStartingPoint.get(i)*3;
                        drumList.set(i,drumsListStartingPoint.get(i));
                    }else {
                        drumList.remove(drumList.get(i));
                        i--;
                        System.out.println();
                    }
                }
            }
            command=scanner.nextLine();

        }
        for (int item:drumList){
            System.out.print(item + " ");
        }
        System.out.println();
        System.out.printf("Gabsy has %.2flv.",moneyAvailable);
    }
}
