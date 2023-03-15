package Exercises05_Lists;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class E05_BombNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //входни данни:
        //1ви ред-> поредица от числа и специално число,коет е бомба
        // трябва да се провери кое е числото и да се премахне с невото ляво и дясно число

        List<String> numbersList =Arrays.stream(scanner.nextLine().split("\\s+")).collect(Collectors.toList());


        String[] data= scanner.nextLine().split("\\s+");
        String bombNumber=data[0];
        int power=Integer.parseInt(data[1]);
        int sum=0;

        while (numbersList.contains(bombNumber)){
            int elementIndex=numbersList.indexOf(bombNumber);

            int left=Math.max(0,elementIndex-power);
            int right=Math.min(power + elementIndex,numbersList.size()-1);

            for (int i = right; i >= left; i--) {
                numbersList.remove(i);
            }
        }

        System.out.println(numbersList.stream().mapToInt(Integer::parseInt).sum());

     }
}