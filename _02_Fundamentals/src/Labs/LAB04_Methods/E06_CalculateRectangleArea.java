package LAB04_Methods;

import java.util.Scanner;

public class E06_CalculateRectangleArea {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        double firstNumInp=Double.parseDouble(scanner.nextLine());
        double secondNumInp=Double.parseDouble(scanner.nextLine());
        double result=getRectangleArea(firstNumInp,secondNumInp);
        System.out.printf("%.0f",result);

    }
    public static double getRectangleArea(double firstNum,double secondNum){
        return firstNum*secondNum;

    }
}
