package EXERCISES02;

import java.util.Scanner;

public class LunchBreak08 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        //1.	Име на сериал – текст
        String name=scanner.nextLine();
        //2.	Продължителност на епизод  – цяло число в диапазона [10… 90]
        int episode=Integer.parseInt(scanner.nextLine());
        //3.	Продължителност на почивката  – цяло число в диапазона [10… 120]
        int breakTime=Integer.parseInt(scanner.nextLine());

        double lunch=breakTime/8.0;
        double freeTime=breakTime/4.0;
        double remainingTime=breakTime -lunch-freeTime;

        double diff=Math.abs(remainingTime-episode);
        if (remainingTime>=episode){
            System.out.printf("You have enough time to watch %s and left with %.0f minutes free time.",name,Math.ceil(diff));
        }else {
            System.out.printf("You don't have enough time to watch %s, you need %.0f more minutes.",name,Math.ceil(diff));
        }
    }
}
