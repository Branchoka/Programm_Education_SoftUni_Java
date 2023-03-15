package MoreExercises05_Lists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class E03_TakeSkipRope {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        String message=scanner.nextLine();

        String numbersOnly=message.replaceAll("[^0-9]","");
        String letters=message.replaceAll("\\d","");

        List<Integer> numbersList=Arrays.stream(numbersOnly.split("")).map(Integer::parseInt).collect(Collectors.toList());
        List<String> inputList= Arrays.stream(letters.split("")).collect(Collectors.toList());

        List<Integer> take=new ArrayList<>();
        List<Integer> skip=new ArrayList<>();


        for (int i = 0; i < numbersList.size(); i++) {
            int currentNum=numbersList.get(i);
            int index=i;

            if (index % 2==0){
                take.add(currentNum);
            }else {
                skip.add(currentNum);
            }
        }
        String text="";
        int indexJ=0;

        for (int i = 0; i < take.size(); i++) {
            int characterToTake=take.get(i);

            for (int j = 0; j < characterToTake; j++) {
                for (int k = indexJ; k < inputList.size(); k++) {

                    String currentChar=inputList.get(k);
                    text=text+currentChar;
                    indexJ++;
                    break;
                }
            }
            int skipChar=0;

            for (int j = i; j <= i; j++) {
                skipChar=skip.get(j);
                indexJ=indexJ+skipChar;
            }
        }
        System.out.println(text);
    }
}
