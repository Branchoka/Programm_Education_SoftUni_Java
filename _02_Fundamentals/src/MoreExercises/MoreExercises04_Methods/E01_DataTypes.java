package MoreExercises04_Methods;

import java.util.Scanner;

public class E01_DataTypes {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        String type=scanner.nextLine();
        if (type.equals("int")){
            int number=Integer.parseInt(scanner.nextLine());
            printType(number);
        }
        if (type.equals("real")){
           double number=Double.parseDouble(scanner.nextLine());
            printType(number);
        }
        if (type.equals("string")){
            String text=scanner.nextLine();
            printType(text);
        }


    }
    public static void printType(int num){
        num=num*2;
        System.out.println(num);
    }
    public static void printType(double num){
        double result= num * 1.5;
        System.out.printf("%.2f",result);
    }
    public static void printType(String text){
        System.out.printf("$%s$",text);


    }
}
