package MoreExercises04_Methods;

import java.util.Scanner;

public class E05_MultiplicationSign {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        double num1=Double.parseDouble(scanner.nextLine());
        double num2=Double.parseDouble(scanner.nextLine());
        double num3=Double.parseDouble(scanner.nextLine());

        double sumOfTwo=multiply(num1,num2);
        double sumOfAll=multiply(sumOfTwo,num3);

        if (sumOfAll<0){
            System.out.println("negative");
        }else if (sumOfAll == 0){
            System.out.println("zero");
        }else {
            System.out.println("positive");
        }
    }
    public static double multiply(double x,double y){

        if (x == 0  || y==0){
            return 0;
        }else if (y>0){
            return x+multiply(x,y-1);
        }else if (y<0){
            return -multiply(x, -y);
        }else {
            return -1;
        }

    }

}
