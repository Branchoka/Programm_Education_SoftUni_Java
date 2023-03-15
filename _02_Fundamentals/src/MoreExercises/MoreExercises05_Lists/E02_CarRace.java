package MoreExercises05_Lists;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class E02_CarRace {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        List<Integer> inputList= Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        int listLength=inputList.size();

        List<Integer> leftCarList=inputList.subList(0,listLength/2);
        List<Integer> rightCarList=inputList.subList(listLength/2+1,listLength);

        double leftCarSum=0;
        double rightCarSum=0;

        for (int index = 0; index < leftCarList.size(); index++) {
            int currentNum=leftCarList.get(index);

            if (currentNum!=0){
                leftCarSum+=currentNum;
            }else {
                leftCarSum=leftCarSum-leftCarSum*0.20;
            }
        }
        for (int indexRightCar = rightCarList.size()-1; indexRightCar >= 0; indexRightCar--) {
                int currentNum=rightCarList.get(indexRightCar);

                if (currentNum!=0){
                    rightCarSum+=currentNum;
                }else {
                    rightCarSum=rightCarSum-rightCarSum*0.20;
                }

        }

        if (leftCarSum < rightCarSum){
            System.out.printf("The winner is left with total time: %.1f",leftCarSum);
        }else {
            System.out.printf("The winner is right with total time: %.1f",rightCarSum);
        }
    }
}
