package Exercises05_Lists;

import java.util.*;
import java.util.stream.Collectors;

public class E06_CardsGame {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        List<Integer> firstHand= Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toList());

        List<Integer> secondHand=Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toList());

        while (firstHand.size() !=0 && secondHand.size() != 0 ) {
            int firstPlayerCard = firstHand.get(0);
            int secondPlayerCard = secondHand.get(0);

            firstHand.remove(0);
            secondHand.remove(0);

            if (firstPlayerCard > secondPlayerCard) {
                firstHand.add(firstPlayerCard);
                firstHand.add(secondPlayerCard);

            } else if (secondPlayerCard > firstPlayerCard) {
                secondHand.add(secondPlayerCard);
                secondHand.add(firstPlayerCard);
            }
        }
        if (firstHand.size() == 0){
            System.out.printf("Second player wins! Sum: %d", getCardSum(secondHand,firstHand));
        }else if (secondHand.size() == 0){
            System.out.printf("First player wins! Sum: %d",getCardSum(firstHand,secondHand));
        }
    }
    public static int getCardSum(List<Integer> firstPlayerCards,List<Integer> secondPlayerCards){
        
        int sum=0;

        for (int i = 0; i < firstPlayerCards.size() + secondPlayerCards.size(); i++) {
            int currentNum=firstPlayerCards.get(i);
            sum+=currentNum;
        }
        
        return sum;
    }
}
