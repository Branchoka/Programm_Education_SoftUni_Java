package Exercises04_Methods;

import java.util.Scanner;
public class E05_AddAndSubtract {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        int firstNum=Integer.parseInt(scanner.nextLine());
        int secondNum=Integer.parseInt(scanner.nextLine());
        int thirdNum=Integer.parseInt(scanner.nextLine());
        int sumOfNumbers=getSum(firstNum,secondNum);
        int subtract=subtract(sumOfNumbers,thirdNum);

        System.out.println(subtract);

    }
    public static int getSum(int firstNum,int secondNum){
        return firstNum+secondNum;

    }
    public static int subtract(int n1,int n2){
        return n1-n2;

    }
}
