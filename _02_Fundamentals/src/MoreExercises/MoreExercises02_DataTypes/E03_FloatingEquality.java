package MoreExercises02_DataTypes;

import java.util.Scanner;

public class E03_FloatingEquality {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);


        double eps=0.000001;
        double numberA=0.0;
        double numberB=0.0;

        while (true){
            numberA=Double.parseDouble(scanner.nextLine());
            numberB=Double.parseDouble(scanner.nextLine());

            boolean isEqual=Math.abs(numberA-numberB)< eps;
            if (isEqual){
                System.out.println("True");
            }else {
                System.out.println("False");
            }
            return;
        }
    }
}
