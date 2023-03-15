package Exercises04_Methods;

import java.util.Scanner;

public class E01_SmallestOfThreeNumbers {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int firstNum=Integer.parseInt(scanner.nextLine());
        int secondNum=Integer.parseInt(scanner.nextLine());
        int thirdNum=Integer.parseInt(scanner.nextLine());


        printSmallest(firstNum,secondNum,thirdNum);

    }
    public static void printSmallest(int firstNum,int secondNum,int thirdNum){
        if (firstNum<=secondNum && firstNum<=thirdNum){
            System.out.println(firstNum);
        }else if (secondNum<=firstNum && secondNum<=thirdNum){
            System.out.println(secondNum);
        }else if (thirdNum<=firstNum && thirdNum<=secondNum){
            System.out.println(thirdNum);
        }

    }
}
