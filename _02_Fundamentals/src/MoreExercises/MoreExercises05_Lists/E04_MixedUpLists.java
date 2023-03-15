package MoreExercises05_Lists;

import java.util.*;
import java.util.stream.Collectors;

public class E04_MixedUpLists {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        List<Integer> firstLineList= Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        List<Integer> secondLineList=Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        List<Integer> reversedList=new ArrayList<>();
        List<Integer> newList=new ArrayList<>();

        List<Integer> lastList=new ArrayList<>();

        for (int i =secondLineList.size()-1; i >= 0; i--) {
            reversedList.add(secondLineList.get(i));
        }

        List<Integer> combinedList=new ArrayList<>();

        boolean secondIsBigger=false;

        if (firstLineList.size()>secondLineList.size()){
            secondIsBigger=true;
        }

        if (secondIsBigger){
            for (int i = 0; i < reversedList.size(); i++) {
                int currentNum=firstLineList.get(i);
                int number2=reversedList.get(i);

                combinedList.add(currentNum);
                combinedList.add(number2);
            }
            int num1=firstLineList.get(firstLineList.size()-2);
            int num2=firstLineList.get(firstLineList.size()-1);

            if (num1>num2){
                int tempNum=num1;
                num1=num2;
                num2=tempNum;
            }
            for (int i = 0; i < combinedList.size(); i++) {
                int currentNum=combinedList.get(i);
                if (currentNum>num1 && currentNum<num2){
                    lastList.add(currentNum);
                }
            }
            Collections.sort(lastList);
            for (int item:lastList){
                System.out.print(item + " ");
            }
        }else {
            for (int i = 0; i < firstLineList.size(); i++) {
                int currentNum=reversedList.get(i);
                int num2=firstLineList.get(i);

                combinedList.add(currentNum);
                combinedList.add(num2);
            }
            int num1=reversedList.get(reversedList.size()-2);
            int num2=reversedList.get(reversedList.size()-1);

            if (num1>num2){
                int tempNum=num1;
                num1=num2;
                num2=tempNum;

            }
            for (int i = 0; i < combinedList.size(); i++) {
                int currentNum=combinedList.get(i);
                if (currentNum>num1 && currentNum<num2){
                    lastList.add(currentNum);
                }
            }
            Collections.sort(lastList);
            for (int item:lastList){
                System.out.print(item + " ");
            }
        }

    }
}
